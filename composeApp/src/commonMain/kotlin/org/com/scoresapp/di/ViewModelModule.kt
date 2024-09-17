package org.com.scoresapp.di

import org.com.scoresapp.splash.SplashViewModel
import org.koin.dsl.module

val viewModelModule = module {
    factory {
        SplashViewModel(
            isLoggedInUserUseCase = get()
        )
    }
}