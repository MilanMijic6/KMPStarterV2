package com.vega.domain.model.login

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestBody(
    val email: String,
    val password: String
)