package com.sarayrah.abdallah.jhrapp

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this code bellow to insert custom action bar title, to make the title layout direction rtl
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.titlebar)

        val tr = fragmentManager.beginTransaction()
        val obj = AboutFragment()
        tr.replace(R.id.fc, obj)
        tr.commit()

        nv.setOnNavigationItemSelectedListener { item ->

            if (item.itemId == R.id.about) {
                val tr = fragmentManager.beginTransaction()
                val obj = AboutFragment()
                tr.replace(R.id.fc, obj)
                tr.commit()
            }

//            else if (item.itemId == R.id.deputies) {
//                val tr = fragmentManager.beginTransaction()
//                val obj = DeputiesFragment()
//                tr.replace(R.id.fc, obj)
//                tr.commit()
//            }

            item.isChecked = true

            false

        }

    }
}

