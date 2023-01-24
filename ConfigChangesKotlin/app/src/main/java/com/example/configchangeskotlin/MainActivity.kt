package com.example.configchangeskotlin

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val tag : String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag, "onCreate()")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(tag, "onConfigurationChanged()")
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            Log.d(tag, "Orientation Landscape")

        if(newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO)
            Log.d(tag, "Keyboard Hidden No")
    }
}