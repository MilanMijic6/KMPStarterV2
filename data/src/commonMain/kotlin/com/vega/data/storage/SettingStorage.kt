package com.vega.data.storage

interface SettingStorage {
    fun saveToken(token: String)
    fun getToken(): String
    fun removeToken()
}