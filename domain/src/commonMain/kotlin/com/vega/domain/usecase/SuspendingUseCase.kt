package com.vega.domain.usecase

abstract class SuspendingUseCase<Input, Output> {
    abstract suspend fun execute(parameter: Input): Output
}