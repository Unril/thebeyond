package dev.thebeyond.application

import dev.thebeyond.application.model.User
import dev.thebeyond.application.routes.JwtConfig
import dev.thebeyond.application.routes.addAuthenticationRoutes
import dev.thebeyond.application.routes.setupAuthentication
import dev.thebeyond.common.API_V1_AUTH_LOGIN
import dev.thebeyond.common.UserLogin
import dev.thebeyond.common.UserToken
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.config.*
import io.ktor.server.testing.*
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import strikt.api.expectThat
import strikt.assertions.isEqualTo
import strikt.assertions.isNotBlank
import kotlin.test.Test

class AppAuthTest {
    @Test
    fun testRoot() = testApplication {
        val jwtConf = JwtConfig("secret", "issuer", "realm")
        val usersRepo = mockk<UsersRepository>()
        val user = User.new("e@mail", "test", "pass")

        coEvery { usersRepo.userByEmail(any()) } returns user

        environment {
            config = MapApplicationConfig("ktor.environment" to "test")
        }
        application {
            setupAuthentication(jwtConf)
            addAuthenticationRoutes(usersRepo, jwtConf)

            install(io.ktor.server.plugins.contentnegotiation.ContentNegotiation) {
                json()
            }
        }

        val client = createClient {
            this@createClient.install(io.ktor.client.plugins.contentnegotiation.ContentNegotiation) {
                json()
            }
        }

        val response = client.get(API_V1_AUTH_LOGIN) {
            contentType(ContentType.Application.Json)
            setBody(UserLogin("e@mail", "pass"))
        }

        expectThat(response.status)
            .isEqualTo(HttpStatusCode.OK)
        expectThat(response.body<UserToken>().token)
            .isNotBlank()
        coVerify(exactly = 1) { usersRepo.userByEmail(user.email) }
    }
}
