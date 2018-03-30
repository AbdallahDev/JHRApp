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
            "ahmed_reqeb_body" -> {
                view.deputy_tv.setText(R.string.ahmed_reqeb_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ahmed_reqeb_ic_launcher_round)
                })
            }
            "ahmed_hamesat_body" -> {
                view.deputy_tv.setText(R.string.ahmed_hamesat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ahmed_hamesat_ic_launcher_round)
                })
            }
            "ramadan_hunaiti_body" -> {
                view.deputy_tv.setText(R.string.ramadan_hunaiti_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ramadan_hunaiti_ic_launcher_round)
                })
            }
            "nassar_qaisi_body" -> {
                view.deputy_tv.setText(R.string.nassar_qaisi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.nassar_qaisi_ic_launcher_round)
                })
            }
            "fadil_abadi_body" -> {
                view.deputy_tv.setText(R.string.fadil_abadi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.fadil_abadi_ic_launcher_round)
                })
            }
            "ahmed_lozi_body" -> {
                view.deputy_tv.setText(R.string.ahmed_lozi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ahmed_lozi_ic_launcher_round)
                })
            }
            "tamer_pino_body" -> {
                view.deputy_tv.setText(R.string.tamer_pino_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.tamer_pino_ic_launcher_round)
                })
            }
            "mostafa_assaf_body" -> {
                view.deputy_tv.setText(R.string.mostafa_assaf_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mostafa_assaf_ic_launcher_round)
                })
            }
            "hasan_ajarma_body" -> {
                view.deputy_tv.setText(R.string.hasan_ajarma_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hasan_ajarma_ic_launcher_round)
                })
            }
            "barakat_abadi_body" -> {
                view.deputy_tv.setText(R.string.barakat_abadi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.barakat_abadi_ic_launcher_round)
                })
            }
            "riad_azzam_body" -> {
                view.deputy_tv.setText(R.string.riad_azzam_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.riad_azzam_ic_launcher_round)
                })
            }
            "rashed_shouha_body" -> {
                view.deputy_tv.setText(R.string.rashed_shouha_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.rashed_shouha_ic_launcher_round)
                })
            }
            "abdulmoneim_oudat_body" -> {
                view.deputy_tv.setText(R.string.abdulmoneim_oudat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdulmoneim_oudat_ic_launcher_round)
                })
            }
            "mahmoud_titi_body" -> {
                view.deputy_tv.setText(R.string.mahmoud_titi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mahmoud_titi_ic_launcher_round)
                })
            }
            "ibrahim_hani_body" -> {
                view.deputy_tv.setText(R.string.ibrahim_hani_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ibrahim_hani_ic_launcher_round)
                })
            }
            "nidal_taani_body" -> {
                view.deputy_tv.setText(R.string.nidal_taani_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.nidal_taani_ic_launcher_round)
                })
            }
            "joudat_darabsa_body" -> {
                view.deputy_tv.setText(R.string.joudat_darabsa_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.joudat_darabsa_ic_launcher_round)
                })
            }
            "khaled_hassan_body" -> {
                view.deputy_tv.setText(R.string.khaled_hassan_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khaled_hassan_ic_launcher_round)
                })
            }
            "fawaz_zoubi_body" -> {
                view.deputy_tv.setText(R.string.fawaz_zoubi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.fawaz_zoubi_ic_launcher_round)
                })
            }
            "abdullah_obaidat_body" -> {
                view.deputy_tv.setText(R.string.abdullah_obaidat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdullah_obaidat_ic_launcher_round)
                })
            }
            "wael_razouk_body" -> {
                view.deputy_tv.setText(R.string.wael_razouk_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.wael_razouk_ic_launcher_round)
                })
            }
            "hosny_shyab_body" -> {
                view.deputy_tv.setText(R.string.hosny_shyab_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hosny_shyab_ic_launcher_round)
                })
            }
            "mostafa_alkhasawneh_body" -> {
                view.deputy_tv.setText(R.string.mostafa_alkhasawneh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mostafa_alkhasawneh_ic_launcher_round)
                })
            }
            "yousef_jarrah_body" -> {
                view.deputy_tv.setText(R.string.yousef_jarrah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.yousef_jarrah_ic_launcher_round)
                })
            }
            "issa_khashashna_body" -> {
                view.deputy_tv.setText(R.string.issa_khashashna_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.issa_khashashna_ic_launcher_round)
                })
            }
            "hamed_saqour_body" -> {
                view.deputy_tv.setText(R.string.hamed_saqour_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hamed_saqour_ic_launcher_round)
                })
            }
            "majed_qweism_body" -> {
                view.deputy_tv.setText(R.string.majed_qweism_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.majed_qweism_ic_launcher_round)
                })
            }
            "khaled_bashtawi_body" -> {
                view.deputy_tv.setText(R.string.khaled_bashtawi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khaled_bashtawi_ic_launcher_round)
                })
            }
            "ibrahim_quran_body" -> {
                view.deputy_tv.setText(R.string.ibrahim_quran_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ibrahim_quran_ic_launcher_round)
                })
            }
            "moataz_rumman_body" -> {
                view.deputy_tv.setText(R.string.moataz_rumman_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.moataz_rumman_ic_launcher_round)
                })
            }
            "jamal_gammoh_body" -> {
                view.deputy_tv.setText(R.string.jamal_gammoh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.jamal_gammoh_ic_launcher_round)
                })
            }
            "mohammed_zoubi_body" -> {
                view.deputy_tv.setText(R.string.mohammed_zoubi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammed_zoubi_ic_launcher_round)
                })
            }
            "dawzy_dawood_body" -> {
                view.deputy_tv.setText(R.string.dawzy_dawood_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.dawzy_dawood_ic_launcher_round)
                })
            }
            "ali_hajjaja_body" -> {
                view.deputy_tv.setText(R.string.ali_hajjaja_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ali_hajjaja_ic_launcher_round)
                })
            }
            "mustafa_yaghi_body" -> {
                view.deputy_tv.setText(R.string.mustafa_yaghi_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mustafa_yaghi_ic_launcher_round)
                })
            }
            "ibrahim_sayed_body" -> {
                view.deputy_tv.setText(R.string.ibrahim_sayed_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ibrahim_sayed_ic_launcher_round)
                })
            }
            "khaled_hayari_body" -> {
                view.deputy_tv.setText(R.string.khaled_hayari_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khaled_hayari_ic_launcher_round)
                })
            }
            "fadeyh_dayat_body" -> {
                view.deputy_tv.setText(R.string.fadeyh_dayat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.fadeyh_dayat_ic_launcher_round)
                })
            }
            "mahmoud_adwan_body" -> {
                view.deputy_tv.setText(R.string.mahmoud_adwan_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mahmoud_adwan_ic_launcher_round)
                })
            }
            "atef_tarawneh_body" -> {
                view.deputy_tv.setText(R.string.atef_tarawneh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.atef_tarawneh_ic_launcher_round)
                })
            }
            "raja_sarayra_body" -> {
                view.deputy_tv.setText(R.string.raja_sarayra_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.raja_sarayra_ic_launcher_round)
                })
            }
            "abdullah_zureikat_body" -> {
                view.deputy_tv.setText(R.string.abdullah_zureikat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdullah_zureikat_ic_launcher_round)
                })
            }
        }

        return view
    }

}// Required empty public constructor
