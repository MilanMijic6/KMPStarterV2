package com.vega.data

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform