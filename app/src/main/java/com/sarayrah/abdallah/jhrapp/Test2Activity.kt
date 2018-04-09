package com.sarayrah.abdallah.jhrapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Test2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

        val tr = supportFragmentManager.beginTransaction()
        val obj = Test2Fragment()
        tr.replace(R.id.linearLayout_fragmentContainer, obj)
                .addToBackStack(Test2Fragment().tag)
                .commit()
    }
}
