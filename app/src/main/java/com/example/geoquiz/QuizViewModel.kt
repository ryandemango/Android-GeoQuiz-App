package com.example.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {
    var currentIndex = 0
    var isCheater = false
    private val questionBank = listOf(
        Question(R.string.question1, false),
        Question(R.string.question2, true),
        Question(R.string.question3, true),
        Question(R.string.question4, true),
        Question(R.string.question5, true),
        Question(R.string.question6, false),
        Question(R.string.question7, false),
        Question(R.string.question8, true),
        Question(R.string.question9, false),
        Question(R.string.question10, false),
    )

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }

}