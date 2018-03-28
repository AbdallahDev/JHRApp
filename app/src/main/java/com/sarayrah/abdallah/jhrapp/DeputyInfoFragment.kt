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
            "mohamed_baraisa_body" -> {
                view.deputy_tv.setText(R.string.mohamed_baraisa_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohamed_baraisa_ic_launcher)
                })
            }
            "mosa_hantash_body" -> {
                view.deputy_tv.setText(R.string.mosa_hantash_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mosa_hantash_ic_launcher_round)
                })
            }
            "abdullah_akayla_body" -> {
                view.deputy_tv.setText(R.string.abdullah_akayla_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdullah_akayla_ic_launcher_round)
                })
            }
            "yahya_saud_body" -> {
                view.deputy_tv.setText(R.string.yahya_saud_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.yahya_saud_ic_launcher_round)
                })
            }
            "mosa_wahesh_body" -> {
                view.deputy_tv.setText(R.string.mosa_wahesh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mosa_wahesh_ic_launcher_round)
                })
            }
            "omar_karakeash_body" -> {
                view.deputy_tv.setText(R.string.omar_karakeash_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.omar_karakeash_ic_launcher_round)
                })
            }
            "aziz_obeidi_body" -> {
                view.deputy_tv.setText(R.string.aziz_obeidi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.aziz_obeidi_ic_launcher_round)
                })
            }
            "abdul_mehsiri_body" -> {
                view.deputy_tv.setText(R.string.abdul_mehsiri_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdul_mehsiri_ic_launcher_round)
                })
            }
            "qais_ziadin_body" -> {
                view.deputy_tv.setText(R.string.qais_ziadin_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.qais_ziadin_ic_launcher_round)
                })
            }
            "khaled_awad_body" -> {
                view.deputy_tv.setText(R.string.khaled_awad_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khaled_awad_ic_launcher_round)
                })
            }
            "saleh_armouti_body" -> {
                view.deputy_tv.setText(R.string.saleh_armouti_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.saleh_armouti_ic_launcher_round)
                })
            }
            "mansour_sjaja_body" -> {
                view.deputy_tv.setText(R.string.mansour_sjaja_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mansour_sjaja_ic_launcher_round)
                })
            }
            "khamis_atieh_body" -> {
                view.deputy_tv.setText(R.string.khamis_atieh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khamis_atieh_ic_launcher_round)
                })
            }
            "ahmed_safadi_body" -> {
                view.deputy_tv.setText(R.string.ahmed_safadi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ahmed_safadi_ic_launcher_round)
                })
            }
            "khair_saileik_body" -> {
                view.deputy_tv.setText(R.string.khair_saileik_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khair_saileik_ic_launcher_round)
                })
            }
        }

        return view
    }

}// Required empty public constructor
