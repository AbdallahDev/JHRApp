package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_deputies.view.*


/**
 * A simple [Fragment] subclass.
 */
class DeputiesFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_deputies, container, false)

        view.andre_hawari.setOnClickListener {
            Values.deputy_name = "andre_hawari_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khaleel_atieh.setOnClickListener {
            Values.deputy_name = "khaleel_atieh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdulrahman_owaisha.setOnClickListener {
            Values.deputy_name = "abdulrahman_owaisha_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohamed_baraisa.setOnClickListener {
            Values.deputy_name = "mohamed_baraisa_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mosa_hantash.setOnClickListener {
            Values.deputy_name = "mosa_hantash_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdullah_akayla.setOnClickListener {
            Values.deputy_name = "abdullah_akayla_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        return view
    }

}// Required empty public constructor
