package com.example.viewskotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class ClearableEditText(context: Context, linearActivityId: LinearLayout) : LinearLayout(context) {

    private val editText : EditText
    private val clearButton : Button

    init {
        val infService = Context.LAYOUT_INFLATER_SERVICE
        val layoutInflater : LayoutInflater = context.getSystemService(infService) as  LayoutInflater
        val view : View = layoutInflater.inflate(R.layout.activity_clearable_edit_text, this, true)
        editText = findViewById(R.id.editText)
        clearButton = findViewById(R.id.clearButton)
        hookUpButton()

        val linearActivity : LinearLayout = linearActivityId
        linearActivity.addView(view)
    }

    private fun hookUpButton(){
        clearButton.setOnClickListener { editText.setText("") }
    }
}