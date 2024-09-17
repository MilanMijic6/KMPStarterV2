package com.vega.domain.repository

import com.vega.domain.model.login.LoginRequestBody

interface LoginRepository {

    suspend fun isLoggedIn(): Boolean

    suspend fun loginUser(credentials: LoginRequestBody)

}