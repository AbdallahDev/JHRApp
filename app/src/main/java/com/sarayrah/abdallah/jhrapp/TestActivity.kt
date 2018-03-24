package com.sarayrah.abdallah.jhrapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        khaleel_atieh.setOnClickListener {
            Toast.makeText(this, "jlkj", Toast.LENGTH_SHORT).show()
        }
    }
}
