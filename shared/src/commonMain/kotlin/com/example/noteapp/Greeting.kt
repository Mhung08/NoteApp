package com.example.noteapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}