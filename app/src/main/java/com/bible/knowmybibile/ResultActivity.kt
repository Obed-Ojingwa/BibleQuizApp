package com.bible.knowmybibile

import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", 0)
        val rating = getRating(score, totalQuestions)

        findViewById<TextView>(R.id.tvScore).text = "Score: $score / $totalQuestions"
        findViewById<TextView>(R.id.tvRating).text = "Rating: $rating"

        findViewById<Button>(R.id.btnRestart).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun getRating(score: Int, totalQuestions: Int): String {
        val percentage = (score.toDouble() / totalQuestions) * 100
        return when {
            percentage >= 90 -> "Excellent"
            percentage >= 75 -> "Good"
            percentage >= 50 -> "Average"
            else -> "Poor"
        }
    }
}
