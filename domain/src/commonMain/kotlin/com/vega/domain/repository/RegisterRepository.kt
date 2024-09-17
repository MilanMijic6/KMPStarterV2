package com.vega.domain.repository

import com.vega.domain.model.register.RegisterRequestBody

interface RegisterRepository {

    suspend fun registerUser(userBody: RegisterRequestBody)

}