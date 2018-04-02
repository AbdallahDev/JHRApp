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
class TestFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_test, container, false)

        v.andre_hawari_test.setOnClickListener {
            Values.deputy_name = "andre_hawari_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc_test, obj)
            tr?.commit()
        }

        return v
    }

}// Required empty public constructor
