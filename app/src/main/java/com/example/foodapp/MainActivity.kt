package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var buyBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buyBtn = findViewById(R.id.comprarBtn)
        buyBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, Compra::class.java)
            startActivity(intent)
        }
    }
}