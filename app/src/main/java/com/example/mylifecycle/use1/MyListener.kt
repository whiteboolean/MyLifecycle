package com.example.mylifecycle.use1

import android.util.Log

class MyListener{
    private  val TAG = "MyListener"
    fun start() = Log.d(TAG,"start run ... ")
    fun stop() = Log.d(TAG,"stop run ...")
}