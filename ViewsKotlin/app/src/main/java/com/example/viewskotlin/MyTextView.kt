package com.example.viewskotlin

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MyTextView : AppCompatTextView {
    constructor(context: Context, attrs : AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {}
    constructor(context: Context, attrs : AttributeSet?) : super(context, attrs) {}
    constructor(context: Context) : super(context) {}

}