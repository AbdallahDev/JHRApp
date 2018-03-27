package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_deputy_info.view.*


/**
 * A simple [Fragment] subclass.
 */
class DeputyInfoFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_deputy_info, container, false)

        when (Values.deputy_name) {
            "andre_hawari_body" -> {
                view.deputy_tv.setText(R.string.andre_hawari_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.andre_hawari_ic_launcher_round)
                })
            }
            "khaleel_atieh_body" -> {
                view.deputy_tv.setText(R.string.khaleel_atieh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khaleel_atieh_ic_launcher_round)
                })
            }
            "abdulrahman_owaisha_body" -> {
                view.deputy_tv.setText(R.string.abdulrahman_owaisha_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdulrahman_owaisha_ic_launcher_round)
                })
            }
        }

        return view
    }

}// Required empty public constructor
