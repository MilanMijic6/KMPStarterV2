package com.vega.domain.usecase.register

import com.vega.domain.model.register.RegisterRequestBody
import com.vega.domain.repository.RegisterRepository
import com.vega.domain.usecase.SuspendingUseCase

class RegisterUserUseCase(
    private val registerRepository: RegisterRepository
) : SuspendingUseCase<RegisterRequestBody, Unit>() {
    override suspend fun execute(parameter: RegisterRequestBody) =
        registerRepository.registerUser(parameter)
}