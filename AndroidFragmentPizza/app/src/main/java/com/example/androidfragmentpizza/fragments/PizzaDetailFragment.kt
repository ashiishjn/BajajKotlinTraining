package com.example.androidfragmentpizza.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidfragmentpizza.R
import com.example.androidfragmentpizza.data.Pizza

class PizzaDetailFragment : Fragment()  {

    var position : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState == null)
            if( arguments != null )
                position = arguments?.getInt("position", 0) ?: 0

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frame_details, container, false )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        Toast.makeText(view.context, position.toString(), Toast.LENGTH_SHORT).show()

        view.findViewById<TextView>(R.id.item_name).text = Pizza().pizza_name[position]

        view.findViewById<TextView>(R.id.item_details).text = Pizza().pizza_details[position]
    }
}