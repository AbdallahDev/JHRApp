package com.sarayrah.abdallah.jhrapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val tr = supportFragmentManager.beginTransaction()
        val obj = TestFragment()
        tr.replace(R.id.fc_test, obj)
        tr.commit()
    }
}
