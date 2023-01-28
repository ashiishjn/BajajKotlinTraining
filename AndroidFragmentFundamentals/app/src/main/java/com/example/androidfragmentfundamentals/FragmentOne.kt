package com.example.androidfragmentfundamentals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)

        val buttonClick : Button = view.findViewById(R.id.button_click)
        val editText : EditText = view.findViewById(R.id.editText)

        buttonClick.setOnClickListener {
            Toast.makeText(view.context, editText.text, Toast.LENGTH_SHORT).show()
            editText.setText("")
        }
    }
}