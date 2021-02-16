package com.example.homework_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidlibrary.AndroidLibClass
import com.example.kotlinlib.KotlinLibClass

class MainActivity : AppCompatActivity() {

    private val androidlib = AndroidLibClass("Its andorid lib")
    private val kotlinlib = KotlinLibClass("Its kotlin lib")

    private fun log(msg : String){
        Log.d("Activity lifecycle", msg)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("androidlib", androidlib.androidLibMsg)
        Log.d("androidlib", kotlinlib.kotlinLibMsg)
        log("onStart")
    }

    override fun onRestart() {
        super.onRestart()
        log("onRestart")
    }

    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }
}