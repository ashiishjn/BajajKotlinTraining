package com.example.layoutskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layoutkotlin.GridLayoutActivity
import com.example.layoutkotlin.LinearLayoutActivity
import com.example.layoutkotlin.R
import com.example.layoutkotlin.RelativeLayoutActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearButton : Button = findViewById(R.id.LinearButton)
        val relativeButton : Button = findViewById(R.id.RelativeButton)
        val gridButton : Button = findViewById(R.id.GridButton)

        linearButton.setOnClickListener { startActivity(Intent(this, LinearLayoutActivity::class.java)) }

        relativeButton.setOnClickListener { startActivity(Intent(this, RelativeLayoutActivity::class.java)) }

        gridButton.setOnClickListener { startActivity(Intent(this, GridLayoutActivity::class.java)) }
    }
}