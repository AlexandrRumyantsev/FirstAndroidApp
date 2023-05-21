package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val buttonBackToSecondActivity = findViewById<Button>(R.id.buttonBackToSecond);
        buttonBackToSecondActivity.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent);
            finish();
        }
    }
}