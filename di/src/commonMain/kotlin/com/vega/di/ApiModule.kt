package com.vega.di

import com.vega.data.api.ApiClientImpl
import com.vega.data.auth.remote.login.LoginApiImpl
import com.vega.data.auth.remote.register.RegisterApiImpl
import org.koin.dsl.module

val apiModule = module {
    single {
        ApiClientImpl(get())
    }
    single {
        LoginApiImpl(get())
    }
    single {
        RegisterApiImpl(get())
    }
}