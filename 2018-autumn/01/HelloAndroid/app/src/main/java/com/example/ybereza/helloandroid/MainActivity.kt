package com.example.ybereza.helloandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        text.text = greetingFromTechnotrack()
    }
}