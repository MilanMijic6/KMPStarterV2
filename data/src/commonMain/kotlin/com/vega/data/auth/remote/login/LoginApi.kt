package com.vega.data.auth.remote.login

import com.vega.domain.model.login.LoginRequestBody
import io.ktor.client.statement.HttpResponse

interface LoginApi {
    suspend fun login(credentials: LoginRequestBody) : HttpResponse
}