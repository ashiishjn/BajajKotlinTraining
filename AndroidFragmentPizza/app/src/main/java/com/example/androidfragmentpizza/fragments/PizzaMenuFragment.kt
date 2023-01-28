package com.example.androidfragmentpizza.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidfragmentpizza.R
import com.example.androidfragmentpizza.data.Pizza

class PizzaMenuFragment : Fragment() {

//    val listener : OnItemSelectedListener

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frame_menu, container, false )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val arrayAdapter : ArrayAdapter<String> =
            ArrayAdapter(view.context, android.R.layout.simple_list_item_1, Pizza().pizza_name)

        val listView : ListView = view.findViewById(R.id.menu_list)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(view.context,
                "Called by fragment A \nPosition :" +  (position+1).toString(),
                Toast.LENGTH_SHORT).show()
            listener.onPizzaItemSelected(position)
        }
    }

    private lateinit var listener : OnItemSelectedListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is com.example.androidfragmentpizza.fragments.PizzaMenuFragment.OnItemSelectedListener) {      // context instanceof YourActivity
            listener =
                context as OnItemSelectedListener // = (YourActivity) context
        } else {
            throw ClassCastException(
                context.toString()
                        + " must implement PizzaMenuFragment.OnItemSelectedListener"
            )
        }
    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        if(context == OnItemSelectedListener)
//    }


    interface OnItemSelectedListener {
        fun onPizzaItemSelected(position: Int)
    }
}