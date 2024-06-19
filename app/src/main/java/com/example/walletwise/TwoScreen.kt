package com.example.walletwise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoScreen : AppCompatActivity() {
    private lateinit var TwoBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_screen)
        // Initialize btn
        TwoBtn = findViewById(R.id.two_next)
        // Set OnClickListener for the button
        TwoBtn.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}