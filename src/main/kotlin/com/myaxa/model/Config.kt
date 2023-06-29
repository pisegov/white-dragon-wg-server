package com.myaxa.model

data class Config(
    val address: String,
    val peerPrivateKey: String,
    val endpoint: String,
    val allowedIps: String,
    val serverPublicKey: String
)