package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_test2.view.*


/**
 * A simple [Fragment] subclass.
 */
class Test2Fragment : Fragment() {

    private var adapter: FPA? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_test2, container, false)

        adapter = FPA(activity!!.supportFragmentManager)
        view.vp.adapter = adapter

        view.vp.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(view.tabs))


        return view
    }

}// Required empty public constructor

class FPA(fm: android.support.v4.app.FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): android.support.v4.app.Fragment? {
        return if (position == 0)
            Test1Fragment()
        else Test3Fragment()

    }

    override fun getCount(): Int {
        return 2
    }

}
