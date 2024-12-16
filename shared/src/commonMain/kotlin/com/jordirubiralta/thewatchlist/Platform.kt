package com.jordirubiralta.thewatchlist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform