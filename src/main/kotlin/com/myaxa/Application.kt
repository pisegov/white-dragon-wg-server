package com.myaxa

import com.myaxa.features.configureSingleConfigRouting
import io.ktor.server.application.*
import io.ktor.server.netty.*
import com.myaxa.plugins.*

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureSerialization()
    configureRouting()
    configureSingleConfigRouting()
}
