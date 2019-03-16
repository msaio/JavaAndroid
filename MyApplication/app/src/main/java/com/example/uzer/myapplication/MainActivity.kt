package com.example.uzer.myapplication

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

import java.util.ArrayList
import java.util.Random

abstract class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    @SuppressLint("WrongViewCast")
    fun action1(){
        val editext = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        val testview = findViewById<TextView>(R.id.textView)


        button.setOnClickListener {
            testview.alpha
        }
    }

}
