package com.vega.data.storage

import com.russhwolf.settings.Settings
import com.vega.data.Constants.KEY_TOKEN

class SettingStorageImpl(
    private var settings: Settings
) : SettingStorage {

    override fun saveToken(token: String) = settings.putString(KEY_TOKEN, token)

    override fun getToken(): String = settings.getString(KEY_TOKEN, "")

    override fun removeToken() = settings.remove(KEY_TOKEN)

}