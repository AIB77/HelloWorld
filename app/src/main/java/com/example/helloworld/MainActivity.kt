package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var message="HW"
        if(message=="HW") {
            Log.d("MainActivity", "Helle World ${message}")
        }
        else{
            Log.d("MainActivity", "Hi There ${message}")
        }



    }
}