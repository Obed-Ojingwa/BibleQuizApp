package com.bible.knowmybibile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0
    private var userAnswers: MutableList<String?> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val level = intent.getStringExtra("LEVEL")
        questions = when (level) {
            "Easy" -> QuestionRepository.easyQuestions.shuffled()
            "Medium" -> QuestionRepository.mediumQuestions.shuffled()
            "Hard" -> QuestionRepository.hardQuestions.shuffled()
            else -> emptyList()
        }

        userAnswers = MutableList(questions.size) { null }

        loadQuestion()

        findViewById<Button>(R.id.btnNext).setOnClickListener { navigateQuestion(1) }
        findViewById<Button>(R.id.btnPrevious).setOnClickListener { navigateQuestion(-1) }
        findViewById<Button>(R.id.btnSubmit).setOnClickListener { submitQuiz() }
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
                if (option == userAnswers[currentQuestionIndex]) {
                    radioButton.isChecked = true
                }
            }

            findViewById<Button>(R.id.btnPrevious).isEnabled = currentQuestionIndex > 0
            findViewById<Button>(R.id.btnNext).isEnabled = currentQuestionIndex < questions.size - 1

            findViewById<Button>(R.id.btnSubmit).visibility =
                if (currentQuestionIndex == questions.size - 1) View.VISIBLE else View.GONE
        }
    }

    private fun navigateQuestion(direction: Int) {
        val rgOptions = findViewById<RadioGroup>(R.id.rgOptions)
        userAnswers[currentQuestionIndex] = rgOptions.findViewById<RadioButton>(rgOptions.checkedRadioButtonId)?.text?.toString()

        currentQuestionIndex += direction
        loadQuestion()
    }

    private fun submitQuiz() {
        val rgOptions = findViewById<RadioGroup>(R.id.rgOptions)
        userAnswers[currentQuestionIndex] = rgOptions.findViewById<RadioButton>(rgOptions.checkedRadioButtonId)?.text?.toString()

        var score = 0
        for ((index, question) in questions.withIndex()) {
            if (userAnswers[index] == question.correctAnswer) {
                score++
            }
        }

        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("SCORE", score)
        intent.putExtra("TOTAL_QUESTIONS", questions.size)
        startActivity(intent)
        finish()
    }
}
