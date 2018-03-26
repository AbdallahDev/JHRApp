package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_about.view.*


/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        view.council_roles.setOnClickListener {
            Values.page_name = "council_roles_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = AboutPageFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.sessions.setOnClickListener {
            Values.page_name = "sessions_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = AboutPageFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.permanent_office.setOnClickListener {
            Values.page_name = "permanent_office_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = AboutPageFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.executive_office.setOnClickListener {
            Values.page_name = "executive_office_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = AboutPageFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.committees.setOnClickListener {
            Values.page_name = "committees_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = AboutPageFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.meetings.setOnClickListener {
            Values.page_name = "meetings_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = AboutPageFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        return view
    }

}// Required empty public constructor

