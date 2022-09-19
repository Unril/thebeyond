package dev.thebeyond.application.routes

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import dev.thebeyond.application.UsersRepository
import dev.thebeyond.application.model.USER_ID_STRING_LENGTH
import dev.thebeyond.application.model.User
import dev.thebeyond.common.API_V1_AUTH_CHECK
import dev.thebeyond.common.API_V1_AUTH_LOGIN
import dev.thebeyond.common.API_V1_AUTH_REGISTER
import dev.thebeyond.common.NewUserRegistration
import dev.thebeyond.common.UserLogin
import dev.thebeyond.common.UserToken
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

private fun Application.configProperty(path: String) = environment.config.property(path).getString()

data class JwtConfig(
    val secret: String,
    val issuer: String,
    val realm: String,
)

fun Application.jwtConfig() = JwtConfig(
    configProperty("jwt.secret"),
    configProperty("jwt.issuer"),
    configProperty("jwt.realm"),
)

const val USER_ID_CLAIM = "userid"

private fun JwtConfig.algorithm() = Algorithm.HMAC256(secret)

private fun generateToken(jwtConf: JwtConfig, userId: String) =
    JWT.create().withIssuer(jwtConf.issuer).withClaim(USER_ID_CLAIM, userId).sign(jwtConf.algorithm())!!

fun Application.setupAuthentication(jwtConf: JwtConfig) {
    install(Authentication) {
        jwt {
            realm = jwtConf.realm
            verifier(
                JWT.require(jwtConf.algorithm()).withIssuer(jwtConf.issuer).build()
            )
            validate { credential ->
                val id = credential.payload.getClaim(USER_ID_CLAIM).asString()
                logger.info { "Validate user with id $id" }
                if (id.length == USER_ID_STRING_LENGTH) JWTPrincipal(credential.payload) else null
            }
            challenge { _, _ ->
                call.respond(HttpStatusCode.Unauthorized, "Token is not valid or has expired")
            }
        }
    }
}

fun Application.addAuthenticationRoutes(usersRepo: UsersRepository, jwtConf: JwtConfig) {
    routing {
        get(API_V1_AUTH_REGISTER) {
            val reg = call.receive<NewUserRegistration>()
            val user = User.new(reg.email, reg.name, reg.password)
            logger.info { "Register user $user" }
            usersRepo.createUser(user)
            val token = generateToken(jwtConf, user.id.toString())
            call.respond(UserToken(token))
        }

        get(API_V1_AUTH_LOGIN) {
            val login = call.receive<UserLogin>()
            val user = usersRepo.userByEmail(login.email)
            if (user == null) {
                call.respond(HttpStatusCode.Unauthorized, "Invalid user email")
                return@get
            }
            if (!user.password.checkPassword(login.password)) {
                call.respond(HttpStatusCode.Unauthorized, "Invalid user password")
                return@get
            }
            val token = generateToken(jwtConf, user.id.toString())
            call.respond(UserToken(token))
        }

        authenticate {
            get(API_V1_AUTH_CHECK) {
                val principal = call.principal<JWTPrincipal>()!!
                val id = principal.payload.getClaim(USER_ID_CLAIM).asString()
                logger.info { "Check authentication with id $id" }
                call.respond(HttpStatusCode.OK)
            }
        }
    }
}
