package com.example.configchangeskotlin

import android.app.Application
import android.content.res.Configuration
import android.util.Log

class MyApplication: Application() {

    private val tag : String = "MyApplication"

    override fun onCreate() {
        super.onCreate()
        Log.d(tag, "onCreate()")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(tag, "onLowMemory()")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(tag, "onTrimMemory()")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(tag, "onConfigurationChanged()")
    }
}