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
        view.yahya_saud.setOnClickListener {
            Values.deputy_name = "yahya_saud_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mosa_wahesh.setOnClickListener {
            Values.deputy_name = "mosa_wahesh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.omar_karakeash.setOnClickListener {
            Values.deputy_name = "omar_karakeash_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.aziz_obeidi.setOnClickListener {
            Values.deputy_name = "aziz_obeidi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdul_mehsiri.setOnClickListener {
            Values.deputy_name = "abdul_mehsiri_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.qais_ziadin.setOnClickListener {
            Values.deputy_name = "qais_ziadin_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khaled_awad.setOnClickListener {
            Values.deputy_name = "khaled_awad_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.saleh_armouti.setOnClickListener {
            Values.deputy_name = "saleh_armouti_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mansour_sjaja.setOnClickListener {
            Values.deputy_name = "mansour_sjaja_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khamis_atieh.setOnClickListener {
            Values.deputy_name = "khamis_atieh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ahmed_safadi.setOnClickListener {
            Values.deputy_name = "ahmed_safadi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khair_saileik.setOnClickListener {
            Values.deputy_name = "khair_saileik_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        return view
    }

}// Required empty public constructor
