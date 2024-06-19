package com.example.walletwise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    private lateinit var Logbtn: Button
    private lateinit var LogRegi: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Initialize btn
        Logbtn = findViewById(R.id.login)
        LogRegi = findViewById(R.id.logregi)
        // Set OnClickListener for the button
        Logbtn.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        LogRegi.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}