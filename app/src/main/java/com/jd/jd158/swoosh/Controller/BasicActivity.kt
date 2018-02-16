package com.jd.jd158.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

open class BasicActivity : AppCompatActivity() {

    val TAG = "Life Cicle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "${javaClass.simpleName} onCreate")
    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} onStart")
        super.onStart()


    }


    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} onResume")
        super.onResume()

    }


}
