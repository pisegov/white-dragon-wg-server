package com.myaxa.model

import kotlinx.serialization.Serializable

@Serializable
data class Config(
    val address: String,
    val peerPrivateKey: String,
    val endpoint: String,
    val allowedIps: String,
    val serverPublicKey: String,
    val countryCode: String
)