package com.nihas.gradient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View

import android.widget.TextView
import com.nihas.gtv.GradientTextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GradientTextView(findViewById<TextView>(R.id.tv))
            .addColor(Color.parseColor("#800CDD"), Color.parseColor("#3BA3F2"))

        GradientTextView(findViewById<TextView>(R.id.tv2))
            .addColor(intArrayOf(
                Color.parseColor("#F97C3C"),
                Color.parseColor("#FDB54E"),
                Color.parseColor("#64B678"),
                Color.parseColor("#478AEA"),
                Color.parseColor("#8446CC")
            ))

        GradientTextView(findViewById<TextView>(R.id.tv3))
            .addColor(intArrayOf(
                Color.parseColor("#F97C3C"),
                Color.parseColor("#FDB54E"),
                Color.parseColor("#64B678"),
                Color.parseColor("#478AEA"),
                Color.parseColor("#8446CC")
            ))

    }
}