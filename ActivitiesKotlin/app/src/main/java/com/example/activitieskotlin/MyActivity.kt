package com.example.activitieskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MyActivity : AppCompatActivity()  {
    private val tag : String = "MyActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "OnCreate()")
        setContentView(R.layout.activity_main)
    }
}