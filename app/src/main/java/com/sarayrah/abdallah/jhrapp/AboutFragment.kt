package com.sarayrah.abdallah.jhrapp


import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_about.view.*


/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    private var adapter: FPA? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        adapter = FPA(activity!!.supportFragmentManager)
        view.vp.adapter = adapter
        view.vp.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(view.tabs))
        view.tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(view.vp))

        return view
    }


}// Required empty public constructor

class FPA(fm: android.support.v4.app.FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): android.support.v4.app.Fragment? {
        return when (position) {
            0 -> RolesFragment()
            1 -> SessionsFragment()
            else -> OfficeFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}

