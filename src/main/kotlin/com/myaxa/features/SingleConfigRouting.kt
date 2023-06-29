package com.myaxa.features

import com.myaxa.constants.*
import com.myaxa.model.Config
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureSingleConfigRouting() {
    routing {
        get("/config") {
            val config = Config(
                address= HARDCODED_ADDRESS,
                peerPrivateKey= HARDCODED_PRIVATE_KEY,
                serverPublicKey= HARDCODED_PUBLIC_KEY,
                endpoint= HARDCODED_ENDPOINT,
                allowedIps= HARDCODED_ALLOWED_IP,
            )
            call.respond(config)
        }
    }
}
