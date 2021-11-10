package com.example.mylifecycle.user2_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylifecycle.R

class User2Activity : AppCompatActivity() {
    private var myPresenter: MyPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myPresenter = MyPresenter()
    }

    override fun onResume() {
        super.onResume()
        myPresenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        myPresenter?.onPause()
    }
}