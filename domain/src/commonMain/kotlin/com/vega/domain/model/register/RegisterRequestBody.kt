package com.vega.domain.model.register

import kotlinx.serialization.Serializable

@Serializable
data class RegisterRequestBody(
    val email: String,
    val password: String,
    val name: String,
    val lastName: String
)