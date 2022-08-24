package pro.thebeyond.application

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class User(val username: String, val password: String)

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 8080
    val secret = System.getenv("TB_JWT_SECRET")?.toString() ?: throw Error("Cannot load JWT secret")
    val issuer = "thebeyond"
    val myRealm = "Access to '/game'"
    embeddedServer(Netty, port = port) {
        install(ContentNegotiation) {
            json()
        }
        install(Compression) {
            gzip()
        }
        install(Authentication) {
            jwt {
                realm = myRealm
                verifier(
                    JWT
                        .require(Algorithm.HMAC256(secret))
                        .withIssuer(issuer)
                        .build()
                )
                validate { credential ->
                    if (credential.payload.getClaim("username").asString() != "") {
                        JWTPrincipal(credential.payload)
                    } else {
                        null
                    }
                }
                challenge { _, _ ->
                    call.respond(HttpStatusCode.Unauthorized, "Token is not valid or has expired")
                }
            }
        }
        routing {
            get("/") {
                call.respondText(
                    this::class.java.classLoader.getResource("index.html")!!.readText(),
                    ContentType.Text.Html
                )
            }
            static("/") {
                resources()
            }
            post("/login") {
                val user = call.receive<User>()
                //TODO: Check username and password
                val token = JWT.create()
                    .withIssuer(issuer)
                    .withClaim("username", user.username)
                    .sign(Algorithm.HMAC256(secret))
                call.respond(hashMapOf("token" to token))
            }
            authenticate {
                get("/game") {
                    val principal = call.principal<JWTPrincipal>()
                    val username = principal!!.payload.getClaim("username").asString()
                    call.respondText("Hello, $username!")
                }
            }
        }
    }.start(wait = true)
}