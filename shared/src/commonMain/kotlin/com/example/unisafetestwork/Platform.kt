package com.example.unisafetestwork

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform