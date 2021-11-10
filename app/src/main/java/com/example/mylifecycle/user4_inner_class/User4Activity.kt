package com.example.mylifecycle.user4_inner_class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.example.mylifecycle.R
import kotlin.math.log

private const val TAG = "User4Activity"
class User4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user4)
        lifecycle.addObserver(MyObserver())
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    inner class MyObserver:LifecycleObserver{
        private  val TAG = "User4Activity"
        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        fun onCreate() = Log.d(TAG,"lifeCycle call onCreate")

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        fun  onStart() = Log.d(TAG,"lifeCycle call onStart")

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        fun  onResume() = Log.d(TAG,"lifeCycle call onResume")

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onPause() = Log.d(TAG, "lifeCycle call onPause")
    }
}