package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_deputies.view.*


/**
 * A simple [Fragment] subclass.
 */
class DeputiesFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_deputies, container, false)

        view.khaleel_atieh.setOnClickListener {
            Toast.makeText(activity, "jj", Toast.LENGTH_SHORT).show()
        }

        return view
    }

}// Required empty public constructor
