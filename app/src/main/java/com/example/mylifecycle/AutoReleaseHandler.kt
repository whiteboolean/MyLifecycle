package com.example.mylifecycle

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

/**
 * 自动释放内存的Handler
 */
class AutoReleaseHandler(
    private val owner: LifecycleOwner?,
    looper: Looper = Looper.getMainLooper()
) : Handler(looper), DefaultLifecycleObserver {


    init {
        owner?.lifecycle?.addObserver(this)
    }


    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        removeCallbacksAndMessages(null)
        owner?.lifecycle?.removeObserver(this)
    }
}