package com.vega.data.auth.repository.login

import com.vega.data.auth.model.LoginResponse
import com.vega.data.auth.remote.login.LoginApi
import com.vega.data.storage.SettingStorage
import com.vega.domain.model.login.LoginRequestBody
import com.vega.domain.repository.LoginRepository
import io.ktor.client.call.body

class LoginRepositoryImpl(
    private val loginApi: LoginApi,
    private val settingsStorage: SettingStorage
) : LoginRepository {
    override suspend fun isLoggedIn(): Boolean = settingsStorage.getToken().isNotEmpty()

    override suspend fun loginUser(credentials: LoginRequestBody) {
        runCatching {
            loginApi.login(credentials)
        }.mapCatching {
            settingsStorage.saveToken(it.body<LoginResponse>().token)
        }.getOrThrow()
    }
}