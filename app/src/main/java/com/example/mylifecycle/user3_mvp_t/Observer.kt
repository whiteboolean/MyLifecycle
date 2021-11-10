package com.example.mylifecycle.user3_mvp_t

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

private const val TAG = "Observer"

class Observer : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectListener() = Log.d(TAG, "connectListener run...")


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun disconnectListener() = Log.d(TAG, "disconnectListener run ...")
}