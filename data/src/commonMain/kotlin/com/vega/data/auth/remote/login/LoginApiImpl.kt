package com.vega.data.auth.remote.login

import com.vega.data.api.ApiClientImpl
import com.vega.domain.model.login.LoginRequestBody
import io.ktor.client.statement.HttpResponse

class LoginApiImpl(
    private val apiClient: ApiClientImpl
) : LoginApi {
    override suspend fun login(credentials: LoginRequestBody): HttpResponse =
        apiClient.login("api/users/login", credentials)
}