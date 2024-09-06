package com.bible.knowmybibile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val navButton = findViewById<Button>(R.id.navButton)
        val intent = Intent(this@SecondActivity, MainActivity::class.java)
        navButton.setOnClickListener {
            startActivity(intent)
            finish()
        }

    }
}