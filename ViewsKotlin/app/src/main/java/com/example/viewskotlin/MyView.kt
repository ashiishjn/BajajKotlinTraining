package com.example.viewskotlin

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View

class MyView : View {

    constructor(context: Context, attrs : AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {}
    constructor(context: Context, attrs : AttributeSet?) : super(context, attrs) {}
    constructor(context: Context) : super(context) {}

    override fun onDraw(canvas: Canvas?) {
        val height = measuredHeight
        val width = measuredWidth

        val px = width / 2
        val py = height / 2

        val mTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mTextPaint.color = Color.WHITE

        val displayText = "Hello World!"

        val textWidth = mTextPaint.measureText(displayText)

        canvas!!.drawText(displayText, px - textWidth / 2, py.toFloat(), mTextPaint)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val measuredHeight = measureHeight(heightMeasureSpec)
        val measuredWidth = measureWidth(widthMeasureSpec)

        setMeasuredDimension(measuredHeight, measuredWidth)
    }

    fun measureHeight(measureSpec: Int) : Int{
        val specMode = MeasureSpec.getMode(measureSpec)
        val specSize = MeasureSpec.getSize(measureSpec)

        var result = 500

        if (specMode == MeasureSpec.AT_MOST) {
            result = specSize
        } else if (specMode == MeasureSpec.EXACTLY) {
            result = specSize
        }
        return result
    }

    fun measureWidth(measureSpec: Int) : Int {
        val specMode = MeasureSpec.getMode(measureSpec)
        val specSize = MeasureSpec.getSize(measureSpec)

        var result = 500

        if (specMode == MeasureSpec.AT_MOST) {
            result = specSize
        } else if (specMode == MeasureSpec.EXACTLY) {
            result = specSize
        }
        return result
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return true
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        return true
    }

    override fun onTrackballEvent(event: MotionEvent?): Boolean {
        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return true
    }
}