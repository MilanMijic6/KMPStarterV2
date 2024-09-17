package com.vega.data.auth.remote.register

import com.vega.data.api.ApiClientImpl
import com.vega.domain.model.register.RegisterRequestBody
import io.ktor.client.statement.HttpResponse

class RegisterApiImpl(
    private val apiClient: ApiClientImpl
) : RegisterApi {
    override suspend fun register(userBody: RegisterRequestBody): HttpResponse =
        apiClient.register("api/Users/register", userBody)
}