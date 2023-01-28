package com.example.flowersappkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class View(context: Context, val resource : Int, items : List<FlowerClass>)
    : ArrayAdapter<FlowerClass>(context, resource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val newView : LinearLayout

        if(convertView == null){
            newView = LinearLayout(context)
            val inflater  = Context.LAYOUT_INFLATER_SERVICE
            val layoutInflater : LayoutInflater = context.getSystemService(inflater) as LayoutInflater
            layoutInflater.inflate(resource, newView, true)
        }
        else {
            newView = convertView as LinearLayout
        }
        val classInstance : FlowerClass = getItem(position) as FlowerClass

        val textView : TextView = newView.findViewById(R.id.FlowerName)
        textView.setText(classInstance.flowerName)

        val imageView : ImageView = newView.findViewById(R.id.FlowerImage)
        imageView.setImageResource(classInstance.FlowerImage)

        return newView
    }
}