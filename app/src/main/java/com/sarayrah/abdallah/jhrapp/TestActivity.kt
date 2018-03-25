package com.sarayrah.abdallah.jhrapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var obj = DatabaseHelper(this)
        var db = obj.writableDatabase
        db.execSQL("insert into about(title, body) values('test', ?)",
                arrayOf(this.resources.getString(R.string.sessions)))
        var cur = db.rawQuery("select * from about where about_id = 6", arrayOf())
        cur.moveToFirst()
        testTextView.text = cur.getString(cur.getColumnIndex("body"))
    }
}
