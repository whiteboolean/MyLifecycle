package com.example.mylifecycle.user5_inner_interface_delivery

import android.util.Log

private const val TAG = "MyPresenter"
class MyPresenter : IPresenter {
    override fun onResume() {
        Log.d(TAG, "onResume: Lifecycle call onResume")
    }

    override fun onPause() {
        Log.d(TAG, "pause: Lifecycle call onPause")
    }
}