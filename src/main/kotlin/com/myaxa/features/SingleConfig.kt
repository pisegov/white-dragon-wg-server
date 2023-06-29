package com.myaxa.features

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureSingleConfig() {
    routing {
        get("/config") {

            call.respondText("Hello World!")
        }
    }
}
