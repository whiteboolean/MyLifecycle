package com.example.mylifecycle.user3_mvp_t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mylifecycle.R

private const val TAG = "User3Activity"
class User3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user3)
        lifecycle.addObserver(Observer())
        lifecycle.addObserver(Observer2())
        Log.d(TAG, "onCreate: ")
    }


    override fun onStart() {
        super.onStart()
    }
}
