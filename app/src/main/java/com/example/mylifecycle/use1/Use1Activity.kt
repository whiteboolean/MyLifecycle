package com.example.mylifecycle.use1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylifecycle.R

/**
 *
 * Lifecycle可以有效的避免内存泄漏和解决android生命周期的常见难题
 * Lifecycle 是一个表示android生命周期及状态的对象
 * LifecycleOwner 用于连接有生命周期的对象，如activity,fragment
 * LifecycleObserver 用于观察查LifecycleOwner
 * Lifecycle框架使用观察者模式实现观察者监听被观察者的生命周期的变化
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
        if (this::myListener.isInitialized) {
            myListener.stop()
        }
    }
}