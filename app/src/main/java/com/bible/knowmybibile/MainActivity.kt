package com.bible.knowmybibile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnEasy).setOnClickListener { startQuiz("Easy") }
        findViewById<Button>(R.id.btnMedium).setOnClickListener { startQuiz("Medium") }
        findViewById<Button>(R.id.btnHard).setOnClickListener { startQuiz("Hard") }
    }

    private fun startQuiz(level: String) {
        val intent = Intent(this, QuizActivity::class.java)
        intent.putExtra("LEVEL", level)
        startActivity(intent)
    }
}
