package com.example.mylifecycle.user6_support_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleRegistry
import com.example.mylifecycle.R

class User6Activity : AppCompatActivity() {
    private var mLifecycleRegistry: LifecycleRegistry? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user6)

        //老写法
        mLifecycleRegistry = LifecycleRegistry(this)
        mLifecycleRegistry?.currentState = Lifecycle.State.CREATED

    }

    override fun onStart() {
        super.onStart()
        mLifecycleRegistry?.currentState = Lifecycle.State.STARTED
    }

    override fun getLifecycle(): Lifecycle {
        return mLifecycleRegistry!!
    }
}