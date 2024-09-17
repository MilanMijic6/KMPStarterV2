package com.vega.data.auth.repository.register

import com.vega.data.auth.remote.register.RegisterApi
import com.vega.domain.model.register.RegisterRequestBody
import com.vega.domain.repository.RegisterRepository

class RegisterRepositoryImpl(
    private val registerApi: RegisterApi
) : RegisterRepository {
    override suspend fun registerUser(userBody: RegisterRequestBody) {
        run {
            registerApi.register(userBody)
        }
    }
}