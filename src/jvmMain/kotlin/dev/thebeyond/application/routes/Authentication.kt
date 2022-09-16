package dev.thebeyond.application.routes

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import dev.thebeyond.application.UsersRepository
import dev.thebeyond.application.model.USER_ID_STRING_LENGTH
import dev.thebeyond.application.model.User
import dev.thebeyond.common.NewUserRegistration
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

const val USER_ID_CLAIM = "userid"

fun Application.setupAuthentication() {
    val jwtSecret = configProperty("jwt.secret")
    val jwtIssuer = configProperty("jwt.issuer")
    val jwtRealm = configProperty("jwt.realm")

    install(Authentication) {
        jwt {
            realm = jwtRealm
            verifier(
                JWT.require(Algorithm.HMAC256(jwtSecret))
                    .withIssuer(jwtIssuer)
                    .build()
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

fun Application.addAuthenticationRoutes(usersRepo: UsersRepository) {
    val jwtSecret = configProperty("jwt.secret")
    val jwtIssuer = configProperty("jwt.issuer")

    routing {
        get("/api/register") {
            val reg = call.receive<NewUserRegistration>()
            val user = User.new(reg.email, reg.name, reg.password)
            logger.info { "Register user $user" }
            usersRepo.addUser(user)
            val token = JWT.create()
                .withIssuer(jwtIssuer)
                .withClaim(USER_ID_CLAIM, user.id.toString())
                .sign(Algorithm.HMAC256(jwtSecret))!!
            call.respond(UserToken(token))
        }
    }
}
