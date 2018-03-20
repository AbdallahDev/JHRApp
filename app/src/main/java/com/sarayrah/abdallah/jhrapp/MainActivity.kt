package com.sarayrah.abdallah.jhrapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter: FPA? = null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this code bellow to insert custom action bar title, to make the title layout direction rtl
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.titlebar)

        adapter = FPA(supportFragmentManager)
        vp.adapter = adapter

        vp.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(vp))
    }
}

class FPA(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return AboutFragment()
    }

    override fun getCount(): Int {
        return 3
    }

}