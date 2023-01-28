package com.example.androidfragmentfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViews()

    }

    fun setUpViews(){
        val fragment_1_button : Button = findViewById(R.id.fragment_1_button)

        fragment_1_button.setOnClickListener { replaceFragment(FragmentOne()) }

        val fragment_2_button : Button = findViewById(R.id.fragment_2_button)

        fragment_2_button.setOnClickListener { replaceFragment(FragmentTwo()) }
    }

    fun replaceFragment(fragment : Fragment){
        val fragmentTransaction : FragmentTransaction =supportFragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}