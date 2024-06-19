package com.example.walletwise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Home : AppCompatActivity() {
    private lateinit var Addbutget: ImageView
    private lateinit var Butgetdetails: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        // Initialize btn
        Addbutget = findViewById(R.id.addnewbutget)
        Butgetdetails = findViewById(R.id.butgetdetails)
        // Set OnClickListener for the button
        Addbutget.setOnClickListener {
            val intent = Intent(this, AddBudget::class.java)
            startActivity(intent)
        }
        Butgetdetails.setOnClickListener {
            val intent = Intent(this, ButgetDetails::class.java)
            startActivity(intent)
        }
    }
}