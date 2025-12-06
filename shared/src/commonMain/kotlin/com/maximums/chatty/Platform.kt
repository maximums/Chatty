package com.maximums.chatty

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform