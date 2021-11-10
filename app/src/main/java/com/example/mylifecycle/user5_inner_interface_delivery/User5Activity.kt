package com.example.mylifecycle.user5_inner_interface_delivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylifecycle.R


class User5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user5)
        lifecycle.addObserver(MyPresenter())
    }
}