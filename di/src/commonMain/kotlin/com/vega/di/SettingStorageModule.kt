package com.vega.di

import com.russhwolf.settings.Settings
import com.vega.data.storage.SettingStorageImpl
import org.koin.dsl.module

val settingsStorageModule = module {
    single {
        Settings()
    }
    single {
        SettingStorageImpl(get())
    }
}