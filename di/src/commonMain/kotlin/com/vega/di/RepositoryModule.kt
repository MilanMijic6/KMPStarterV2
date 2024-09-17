package com.vega.di

import com.vega.data.auth.remote.login.LoginApiImpl
import com.vega.data.auth.remote.register.RegisterApiImpl
import com.vega.data.auth.repository.login.LoginRepositoryImpl
import com.vega.data.auth.repository.register.RegisterRepositoryImpl
import com.vega.data.storage.SettingStorageImpl
import org.koin.dsl.module

val repositoryModule = module {
    single {
        LoginRepositoryImpl(
            get<LoginApiImpl>(),
            get<SettingStorageImpl>()
        )
    }
    single {
        RegisterRepositoryImpl(
            get<RegisterApiImpl>()
        )
    }
}