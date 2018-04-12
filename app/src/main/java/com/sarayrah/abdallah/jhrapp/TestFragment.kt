package com.sarayrah.abdallah.jhrapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_test.view.*


/**
 * A simple [Fragment] subclass.
 */
class TestFragment : Fragment() {

    private var fragmentAdp: FPA? = null

    @SuppressLint("Recycle")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_test, container, false)

        fragmentAdp = FPA(this.fragmentManager!!)
        v.vp.adapter = fragmentAdp

        v.vp.addOnPageChangeListener(android.support.design.widget.TabLayout
                .TabLayoutOnPageChangeListener(v.tabs))

        v.tabs.addOnTabSelectedListener(android.support.design.widget.TabLayout.ViewPagerOnTabSelectedListener(v.vp))

        return v
    }

    class FPA(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> CommitteesFragment()
                else -> AboutFragment()
            }

        }

        override fun getCount(): Int {
            return 2
        }
    }

}// Required empty public constructor
