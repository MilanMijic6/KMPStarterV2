package org.com.scoresapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform