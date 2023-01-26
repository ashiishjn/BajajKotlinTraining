package com.example.flowersappkotlin

import android.widget.ListView

class Model() {

    val myClassArray : ArrayList<FlowerClass> = ArrayList()

    fun push() {
        myClassArray.add(FlowerClass("A1",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A2",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A3",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A4",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A5",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A6",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A7",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A8",R.drawable.flower_image))
        myClassArray.add(FlowerClass("A9",R.drawable.flower_image))
    }

    fun get() : ArrayList<FlowerClass>{
        push()
        return myClassArray
    }

}