package com.vega.data.auth.remote.register

import com.vega.domain.model.register.RegisterRequestBody
import io.ktor.client.statement.HttpResponse

interface RegisterApi {
    suspend fun register(userBody: RegisterRequestBody) : HttpResponse
}