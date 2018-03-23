package com.sarayrah.abdallah.jhrapp


import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_about.view.*
import android.support.v4.view.ViewPager
import com.sarayrah.abdallah.jhrapp.R.id.vp


/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    private var adapter: FPA? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        adapter = FPA(childFragmentManager)
        view.vp.adapter = adapter
        view.vp.currentItem = 0
        view.vp.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(view.tabs))
        view.tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(view.vp))

        var pagePosition = -1

        view.vp.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                pagePosition = position
            }

            override fun onPageScrollStateChanged(state: Int) {
                if (state == ViewPager.SCROLL_STATE_DRAGGING) {
                    if (pagePosition == 9) {
                        RolesFragment()
                    }
                }
            }
        })

        return view
    }


}// Required empty public constructor

class FPA(fm: android.support.v4.app.FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): android.support.v4.app.Fragment? {
        return when (position) {
            0 -> RolesFragment()
            1 -> SessionsFragment()
            2 -> OfficeFragment()
            3 -> ExecutiveFragment()
            4 -> SessionsFragment()
            5 -> SessionsFragment()
            6 -> OfficeFragment()
            7 -> ExecutiveFragment()
            8 -> OfficeFragment()
            else -> ExecutiveFragment()
        }
    }

    override fun getCount(): Int {
        return 10
    }

}

