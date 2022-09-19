package dev.thebeyond.application

import dev.thebeyond.application.routes.addAuthenticationRoutes
import dev.thebeyond.application.routes.addStaticContentRoutes
import dev.thebeyond.application.routes.jwtConfig
import dev.thebeyond.application.routes.setupAuthentication
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.resources.*

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    install(CallLogging)
    install(Resources)
    install(ContentNegotiation) {
        json()
    }

    val jwtConf = jwtConfig()
    val db = connectToDatabase()
    val usersRepo = DbUsersRepository(db)

    setupAuthentication(jwtConf)

    addStaticContentRoutes()
    addAuthenticationRoutes(usersRepo, jwtConf)
}
