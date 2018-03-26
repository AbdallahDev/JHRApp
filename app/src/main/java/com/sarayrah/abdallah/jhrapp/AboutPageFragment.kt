package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_about_page.view.*


/**
 * A simple [Fragment] subclass.
 */
class AboutPageFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about_page, container, false)

        when (Values.page_name) {
            "council_roles_body" -> view.tv.setText(R.string.council_roles_body)
            "sessions_body" -> view.tv.setText(R.string.sessions_body)
            "permanent_office_body" -> view.tv.setText(R.string.permanent_office_body)
            "executive_office_body" -> view.tv.setText(R.string.executive_office_body)
            "committees_body" -> view.tv.setText(R.string.committees_body)
        }

        return view
    }

}// Required empty public constructor
