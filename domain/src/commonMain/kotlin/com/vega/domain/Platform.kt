package com.vega.domain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform