package com.nihas.gtv

import android.R.attr
import android.widget.TextView
import android.R.attr.endColor

import android.R.attr.startColor
import android.graphics.LinearGradient
import android.graphics.Shader
import android.util.Log
import java.lang.Exception

/*
* Created by Nihas 27 Sep 2021
* */
class GradientTextView(tv: TextView) {
    var textView: TextView? = null

    init {
        textView = tv
    }

    fun load(tv: TextView): GradientTextView {
        return this
    }

    fun addColor(startColor: Int,endColor: Int): GradientTextView {
        textView?.let {
            it.setTextColor(startColor)
            val textShader: Shader = LinearGradient(
                0F,
                0F,
                it.paint.measureText(textView?.text.toString()),
                it.textSize,
                intArrayOf(attr.startColor, endColor),
                floatArrayOf(0f, 1f),
                Shader.TileMode.CLAMP
            )
            it.paint.shader = textShader
        }
        return this
    }

    fun addColor(colors: IntArray) {
        try {
            textView?.let {
                it.setTextColor(colors[0])
                val textShader: Shader = LinearGradient(
                    0F, 0F, it.paint.measureText(it.text.toString()), it.textSize,
                    colors,
                    null, Shader.TileMode.CLAMP
                )
                it.paint.shader = textShader
            }
        } catch (e: Exception) {
            Log.e(GradientTextView::class.java.simpleName, e.toString())
        }
    }

    fun addColor(tvs: List<TextView>, colors: IntArray) {
        try {
            for (tv in tvs) {
                tv.setTextColor(colors[0])
                val textShader: Shader = LinearGradient(
                    0F, 0F, tv.paint.measureText(tv.text.toString()), tv.textSize,
                    colors,
                    null, Shader.TileMode.CLAMP
                )
                tv.paint.shader = textShader
            }
        } catch (e: Exception) {
            Log.e(GradientTextView::class.java.simpleName, e.toString())
        }
    }

    fun addColor(tvs: List<TextView>, startColor: Int, endColor: Int) {
        try {
            for (tv in tvs) {
                tv.setTextColor(startColor)
                val textShader: Shader = LinearGradient(
                    0F,
                    0F,
                    tv.paint.measureText(tv.text.toString()),
                    tv.textSize,
                    intArrayOf(startColor, endColor),
                    floatArrayOf(0f, 1f),
                    Shader.TileMode.CLAMP
                )
                tv.paint.shader = textShader
            }
        } catch (e: Exception) {
            Log.e(GradientTextView::class.java.simpleName, e.toString())
        }
    }
}