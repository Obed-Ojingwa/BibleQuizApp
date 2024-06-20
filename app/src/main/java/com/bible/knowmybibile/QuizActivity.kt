package com.bible.knowmybibile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val level = intent.getStringExtra("LEVEL")
        questions = when (level) {
            "Easy" -> QuestionRepository.easyQuestions
            "Medium" -> QuestionRepository.mediumQuestions
            "Hard" -> QuestionRepository.hardQuestions
            else -> emptyList()
        }

        loadQuestion()
        findViewById<Button>(R.id.btnSubmit).setOnClickListener { checkAnswer() }
    }

    private fun loadQuestion() {
        if (currentQuestionIndex < questions.size) {
            val question = questions[currentQuestionIndex]
            findViewById<TextView>(R.id.tvQuestion).text = question.question
            val rgOptions = findViewById<RadioGroup>(R.id.rgOptions)
            rgOptions.removeAllViews()
            for (option in question.options) {
                val radioButton = RadioButton(this)
                radioButton.text = option
                rgOptions.addView(radioButton)
            }
        } else {
            showResult()
        }
    }

    private fun checkAnswer() {
        val rgOptions = findViewById<RadioGroup>(R.id.rgOptions)
        val selectedOption = rgOptions.findViewById<RadioButton>(rgOptions.checkedRadioButtonId)?.text
        val correctAnswer = questions[currentQuestionIndex].correctAnswer
        if (selectedOption == correctAnswer) {
            score++
        }
        currentQuestionIndex++
        loadQuestion()
    }

    private fun showResult() {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("SCORE", score)
        intent.putExtra("TOTAL_QUESTIONS", questions.size)
        startActivity(intent)
        finish()
    }
}

