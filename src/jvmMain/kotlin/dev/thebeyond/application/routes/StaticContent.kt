package dev.thebeyond.application.routes

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.addStaticContentRoutes() {
    routing {
        static {
            resource("/", "index.html")
            resource("thebeyond.js")
            static("assets") {
                resources("assets")
            }
        }
    }
}
