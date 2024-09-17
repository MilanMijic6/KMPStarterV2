package com.vega.domain.usecase.login

import com.vega.domain.model.login.LoginRequestBody
import com.vega.domain.repository.LoginRepository
import com.vega.domain.usecase.SuspendingUseCase

class LoginUserUseCase(
    private val loginRepository: LoginRepository
) : SuspendingUseCase<LoginRequestBody, Unit>() {
    override suspend fun execute(parameter: LoginRequestBody) {
        loginRepository.loginUser(parameter)
    }
}