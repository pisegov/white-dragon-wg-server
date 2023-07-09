package com.myaxa.features

import com.myaxa.constants.*
import com.myaxa.model.Config
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

val countriesConfigsMap: Map<String, Config> = mapOf (
   "ne" to  Config(
       address= HARDCODED_ADDRESS,
       peerPrivateKey= HARDCODED_PRIVATE_KEY,
       serverPublicKey= HARDCODED_PUBLIC_KEY,
       endpoint= HARDCODED_ENDPOINT,
       allowedIps= HARDCODED_ALLOWED_IP,
       countryCode= "ne"
   ),
    "ru" to Config(
        address= HARDCODED_ADDRESS_RU,
        peerPrivateKey= HARDCODED_PRIVATE_KEY_RU,
        serverPublicKey= HARDCODED_PUBLIC_KEY_RU,
        endpoint= HARDCODED_ENDPOINT_RU,
        allowedIps= HARDCODED_ALLOWED_IP_RU,
        countryCode= "ru"
    )
)

fun Application.configureSingleConfigRouting() {
    routing {
        get("/config/{code}") {
            val countryCode = call.parameters["code"]
            val config = countriesConfigsMap[countryCode]
            if (config == null) {
                call.respond(HttpStatusCode(204, "Nope, we don't have any servers in this country"))
            } else {
                call.respond(
                    HttpStatusCode(200, "We have server in this country"),
                    config
                )
            }
        }
    }
}
