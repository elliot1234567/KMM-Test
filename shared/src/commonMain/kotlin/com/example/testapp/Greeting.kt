package com.example.testapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "I made a change to test git Hello!!!!!, ${platform.name}!"
    }
}