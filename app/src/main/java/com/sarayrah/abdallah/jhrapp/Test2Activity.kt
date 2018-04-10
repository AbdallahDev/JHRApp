package com.sarayrah.abdallah.jhrapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Test2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)

        val obj = JHRDB(this)
        val db = obj.readableDatabase
        val cursor = db.rawQuery("select name, info, image from deputy", arrayOf())
        cursor.moveToFirst()
    }
}
