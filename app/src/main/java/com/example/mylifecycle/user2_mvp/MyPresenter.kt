package com.example.mylifecycle.user2_mvp

import android.util.Log

class MyPresenter {
    private val TAG = "MyPresenter"
    fun onResume() = Log.d(TAG, "onResume run ...")
    fun onPause() = Log.d(TAG, "onPause run ...")
}