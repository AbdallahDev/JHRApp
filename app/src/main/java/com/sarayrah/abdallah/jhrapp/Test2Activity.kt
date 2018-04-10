package com.sarayrah.abdallah.jhrapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Test2Activity : AppCompatActivity() {

    @SuppressLint("Recycle")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

        val tr = supportFragmentManager.beginTransaction()
        val obj = Test2Fragment()
        tr.replace(R.id.fc_test, obj)
        tr.commit()
    }
}
