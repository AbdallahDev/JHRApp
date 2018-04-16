package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_committee_info.view.*
import com.sarayrah.abdallah.jhrapp.R.id.vp




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CommitteeInfoFragment : Fragment() {

    private var fragmentAdp: CommitteeInfoFragment.FPA? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_committee_info, container, false)

        fragmentAdp = FPA(this.childFragmentManager)

        v.vp.adapter = fragmentAdp

        v.vp.addOnPageChangeListener(android.support.design.widget.TabLayout
                .TabLayoutOnPageChangeListener(v.tabs))

        v.tabs.addOnTabSelectedListener(android.support.design.widget.TabLayout.ViewPagerOnTabSelectedListener(v.vp))

        return v
    }

    class FPA(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> CommitteeRoleFragment()
                else -> CommitteeDeputiesFragment()
            }

        }

        override fun getCount(): Int {
            return 2
        }
    }

}// Required empty public constructor
