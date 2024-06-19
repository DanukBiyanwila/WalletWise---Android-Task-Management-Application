package com.example.walletwise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButgetDetails : AppCompatActivity() {
    private lateinit var Goback: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butget_details)
        // Initialize btn
        Goback = findViewById(R.id.gobackbutgetdetais)
        Goback.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}