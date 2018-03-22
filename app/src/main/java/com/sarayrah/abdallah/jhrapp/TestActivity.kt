package com.sarayrah.abdallah.jhrapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val tr = supportFragmentManager.beginTransaction()
        val obj = Test2Fragment()
        tr.replace(R.id.fc, obj)
        tr.commit()
    }
}
