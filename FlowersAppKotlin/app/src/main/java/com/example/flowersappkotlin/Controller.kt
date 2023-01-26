package com.example.flowersappkotlin

import android.widget.ListView

class Controller(val mainActivity: MainActivity) {

    fun control() {

        val myClassArray : ArrayList<FlowerClass> = get()

        val flowerList : ListView = mainActivity.findViewById(R.id.flowerList)

        val layoutID : Int = R.layout.custom_layout

        val myArrayAdapter : View = View(mainActivity, layoutID, myClassArray)

        flowerList.setAdapter(myArrayAdapter)

    }

    fun get() : ArrayList<FlowerClass> = Model().get()

}