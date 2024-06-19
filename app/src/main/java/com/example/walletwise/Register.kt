package com.example.walletwise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Register : AppCompatActivity() {
    private lateinit var Regibtn: Button
    private lateinit var RegLog: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // Initialize btn
        Regibtn = findViewById(R.id.register)
        RegLog = findViewById(R.id.regi_log)
        // Set OnClickListener for the button
        Regibtn.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        RegLog.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}