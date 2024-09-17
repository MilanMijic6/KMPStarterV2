package com.vega.di

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform