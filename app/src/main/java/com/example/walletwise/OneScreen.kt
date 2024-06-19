package com.example.walletwise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OneScreen : AppCompatActivity() {
    private lateinit var OneBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_screen)
        // Initialize btn
        OneBtn = findViewById(R.id.one_next)
        // Set OnClickListener for the button
        OneBtn.setOnClickListener {
            val intent = Intent(this, TwoScreen::class.java)
            startActivity(intent)
        }
    }
}