package com.vega.data.api

import com.vega.domain.model.login.LoginRequestBody
import com.vega.domain.model.register.RegisterRequestBody
import io.ktor.client.statement.HttpResponse

interface ApiClient {

    suspend fun login(endpoint: String, params: LoginRequestBody): HttpResponse

    suspend fun register(endpoint: String, params: RegisterRequestBody): HttpResponse

}