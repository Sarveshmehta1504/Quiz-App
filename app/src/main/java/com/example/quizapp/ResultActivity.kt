package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish:Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tvScore.text = "Your Score is $correctAnswer out of $totalQuestion"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}