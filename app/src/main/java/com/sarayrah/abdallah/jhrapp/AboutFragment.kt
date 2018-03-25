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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        return view
    }

}// Required empty public constructor

