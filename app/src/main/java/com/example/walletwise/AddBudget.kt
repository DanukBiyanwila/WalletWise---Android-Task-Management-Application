package com.example.walletwise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class AddBudget : AppCompatActivity() {
    private lateinit var Addbutget: Button
    private lateinit var Goback: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_budget)
        // Initialize btn
        Addbutget = findViewById(R.id.addbutget)
        Goback = findViewById(R.id.gobackbutget)
        // Set OnClickListener for the button
        Addbutget.setOnClickListener {
            Toast.makeText(this, "Budget added successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ButgetDetails::class.java)
            startActivity(intent)
        }

        Goback.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}