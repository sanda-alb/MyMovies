package com.example.mymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//https://run.mocky.io/v3/d800ee26-19b3-4be1-ac8f-e6424f485e7d

private val JSON_URL: String = "https://run.mocky.io/v3/d800ee26-19b3-4be1-ac8f-e6424f485e7d"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}