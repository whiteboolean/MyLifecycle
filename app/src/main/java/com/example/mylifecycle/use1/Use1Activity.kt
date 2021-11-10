package com.example.mylifecycle.use1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylifecycle.R

/**
 * 第一個版本(监听器)
 */
class Use1Activity : AppCompatActivity() {
    private lateinit var myListener: MyListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_use1)
        myListener = MyListener()
    }

    override fun onStart() {
        super.onStart()
        if (this::myListener.isInitialized) {
            myListener.start()
        }
    }

    override fun onStop() {
        super.onStop()
        if (this::myListener.isInitialized){
            myListener.stop()
        }
    }
}