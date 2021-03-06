package com.sarayrah.abdallah.jhrapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this code bellow to insert custom action bar title, to make the title layout direction rtl
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.titlebar)

        val tr = supportFragmentManager.beginTransaction()
        val obj = AboutFragment()
        tr.replace(R.id.fc, obj)
        tr.commit()

        nv.setOnNavigationItemSelectedListener { item ->
            when {
                item.itemId == R.id.about -> {
                    val tr = supportFragmentManager.beginTransaction()
                    val obj = AboutFragment()
                    tr.replace(R.id.fc, obj)?.addToBackStack(AboutFragment().tag)?.commit()
                }
                item.itemId == R.id.deputies -> {
                    val tr = supportFragmentManager.beginTransaction()
                    val obj = DeputiesAPIFragment()
                    tr.replace(R.id.fc, obj)?.addToBackStack(DeputiesAPIFragment().tag)?.commit()
                }
                item.itemId == R.id.committees -> {
                    val tr = supportFragmentManager.beginTransaction()
                    val obj = CommitteesFragment()
                    tr.replace(R.id.fc, obj)?.addToBackStack(CommitteesFragment().tag)?.commit()
                }
            }

            item.isChecked = true

            false

        }

    }

}

