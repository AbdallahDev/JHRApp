package com.sarayrah.abdallah.jhrapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_test.view.*

/**
 * A simple [Fragment] subclass.
 */
class RolesFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_roles, container, false)

        if (Values.page_name == "council_roles_body") {
            view.tv.setText(R.string.council_roles_body)
        } else {
            view.tv.setText(R.string.sessions_body)
        }
        return view
    }

}// Required empty public constructor
