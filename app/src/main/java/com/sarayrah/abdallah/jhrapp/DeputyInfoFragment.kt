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
            "haitham_ziadin_body" -> {
                view.deputy_tv.setText(R.string.haitham_ziadin_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.haitham_ziadin_ic_launcher_round)
                })
            }
            "musleh_tarawneh_body" -> {
                view.deputy_tv.setText(R.string.musleh_tarawneh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.musleh_tarawneh_ic_launcher_round)
                })
            }
            "mohammed_ataiqa_body" -> {
                view.deputy_tv.setText(R.string.mohammed_ataiqa_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammed_ataiqa_ic_launcher_round)
                })
            }
            "mahmoud_naimat_body" -> {
                view.deputy_tv.setText(R.string.mahmoud_naimat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mahmoud_naimat_ic_launcher_round)
                })
            }
            "sadah_habashneh_body" -> {
                view.deputy_tv.setText(R.string.sadah_habashneh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.sadah_habashneh_ic_launcher_round)
                })
            }
            "randa_shaar_body" -> {
                view.deputy_tv.setText(R.string.randa_shaar_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.randa_shaar_ic_launcher_round)
                })
            }
            "sabah_shaar_body" -> {
                view.deputy_tv.setText(R.string.sabah_shaar_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.sabah_shaar_ic_launcher_round)
                })
            }
            "abdullah_qaramsah_body" -> {
                view.deputy_tv.setText(R.string.abdullah_qaramsah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdullah_qaramsah_ic_launcher_round)
                })
            }

            "mohamed_falahat_body" -> {
                view.deputy_tv.setText(R.string.mohamed_falahat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohamed_falahat_ic_launcher_round)
                })
            }
            "ibrahim_bdoor_body" -> {
                view.deputy_tv.setText(R.string.ibrahim_bdoor_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ibrahim_bdoor_ic_launcher_round)
                })
            }
            "khaled_fanatsah_body" -> {
                view.deputy_tv.setText(R.string.khaled_fanatsah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.khaled_fanatsah_ic_launcher_round)
                })
            }
            "tariq_khorey_body" -> {
                view.deputy_tv.setText(R.string.tariq_khorey_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.tariq_khorey_ic_launcher_round)
                })
            }

            "mohammad_thahraoy_body" -> {
                view.deputy_tv.setText(R.string.mohammad_thahraoy_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammad_thahraoy_ic_launcher_round)
                })
            }
            "mohammad_nooh_body" -> {
                view.deputy_tv.setText(R.string.mohammad_nooh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammad_nooh_ic_launcher_round)
                })
            }
            "saoud_mahfooth_body" -> {
                view.deputy_tv.setText(R.string.saoud_mahfooth_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.saoud_mahfooth_ic_launcher_round)
                })
            }
            "nabeel_sheshaney_body" -> {
                view.deputy_tv.setText(R.string.nabeel_sheshaney_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.nabeel_sheshaney_ic_launcher_round)
                })
            }
            "qosai_dmesey_body" -> {
                view.deputy_tv.setText(R.string.qosai_dmesey_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.qosai_dmesey_ic_launcher_round)
                })
            }
            "faysal_aoar_body" -> {
                view.deputy_tv.setText(R.string.faysal_aoar_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.faysal_aoar_ic_launcher_round)
                })
            }
            "marzooq_daaja_body" -> {
                view.deputy_tv.setText(R.string.marzooq_daaja_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.marzooq_daaja_ic_launcher_round)
                })
            }
            "hmood_zwahra_body" -> {
                view.deputy_tv.setText(R.string.hmood_zwahra_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hmood_zwahra_ic_launcher_round)
                })
            }

            "mosa_zoahra_body" -> {
                view.deputy_tv.setText(R.string.mosa_zoahra_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mosa_zoahra_ic_launcher_round)
                })
            }
            "nwaf_zeod_body" -> {
                view.deputy_tv.setText(R.string.nwaf_zeod_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.nwaf_zeod_ic_launcher_round)
                })
            }
            "ali_khlaylah_body" -> {
                view.deputy_tv.setText(R.string.ali_khlaylah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ali_khlaylah_ic_launcher_round)
                })
            }
            "abdkareem_dogmy_body" -> {
                view.deputy_tv.setText(R.string.abdkareem_dogmy_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdkareem_dogmy_ic_launcher_round)
                })
            }

            "rayed_khazalah_body" -> {
                view.deputy_tv.setText(R.string.rayed_khazalah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.rayed_khazalah_ic_launcher_round)
                })
            }
            "mofleh_khazalah_body" -> {
                view.deputy_tv.setText(R.string.mofleh_khazalah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mofleh_khazalah_ic_launcher_round)
                })
            }
            "shoaeb_shodefat_body" -> {
                view.deputy_tv.setText(R.string.shoaeb_shodefat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.shoaeb_shodefat_ic_launcher_round)
                })
            }
            "mahmood_fraheed_body" -> {
                view.deputy_tv.setText(R.string.mahmood_fraheed_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mahmood_fraheed_ic_launcher_round)
                })
            }

            "hasan_soud_body" -> {
                view.deputy_tv.setText(R.string.hasan_soud_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hasan_soud_ic_launcher_round)
                })
            }
            "hoseen_qesey_body" -> {
                view.deputy_tv.setText(R.string.hoseen_qesey_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hoseen_qesey_ic_launcher_round)
                })
            }
            "ghazey_hwamleh_body" -> {
                view.deputy_tv.setText(R.string.ghazey_hwamleh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ghazey_hwamleh_ic_launcher_round)
                })
            }
            "abdqader_azaydah_body" -> {
                view.deputy_tv.setText(R.string.abdqader_azaydah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.abdqader_azaydah_ic_launcher_round)
                })
            }

            "nabeel_geshan_body" -> {
                view.deputy_tv.setText(R.string.nabeel_geshan_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.nabeel_geshan_ic_launcher_round)
                })
            }
            "adnaan_rkeebat_body" -> {
                view.deputy_tv.setText(R.string.adnaan_rkeebat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.adnaan_rkeebat_ic_launcher_round)
                })
            }
            "zeed_shawabkah_body" -> {
                view.deputy_tv.setText(R.string.zeed_shawabkah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.zeed_shawabkah_ic_launcher_round)
                })
            }
            "mohammad_hdeeb_body" -> {
                view.deputy_tv.setText(R.string.mohammad_hdeeb_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammad_hdeeb_ic_launcher_round)
                })
            }


            "huda_otoom_body" -> {
                view.deputy_tv.setText(R.string.huda_otoom_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.huda_otoom_ic_launcher_round)
                })
            }
            "oqlah_zboon_body" -> {
                view.deputy_tv.setText(R.string.oqlah_zboon_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.oqlah_zboon_ic_launcher_round)
                })
            }
            "mohammad_ayasrah_body" -> {
                view.deputy_tv.setText(R.string.mohammad_ayasrah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammad_ayasrah_ic_launcher_round)
                })
            }
            "kamal_zgool_body" -> {
                view.deputy_tv.setText(R.string.kamal_zgool_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.kamal_zgool_ic_launcher_round)
                })
            }

            "wasfee_haddad_body" -> {
                view.deputy_tv.setText(R.string.wasfee_haddad_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.wasfee_haddad_ic_launcher_round)
                })
            }
            "safa_momany_body" -> {
                view.deputy_tv.setText(R.string.safa_momany_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.safa_momany_ic_launcher_round)
                })
            }
            "ahmad_freehat_body" -> {
                view.deputy_tv.setText(R.string.ahmad_freehat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ahmad_freehat_ic_launcher_round)
                })
            }
            "mohammad_reyatee_body" -> {
                view.deputy_tv.setText(R.string.mohammad_reyatee_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammad_reyatee_ic_launcher_round)
                })
            }

            "hazem_majali_body" -> {
                view.deputy_tv.setText(R.string.hazem_majali_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hazem_majali_ic_launcher_round)
                })
            }
            "ibraheem_abuez_body" -> {
                view.deputy_tv.setText(R.string.ibraheem_abuez_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ibraheem_abuez_ic_launcher_round)
                })
            }
            "habes_shabeeb_body" -> {
                view.deputy_tv.setText(R.string.habes_shabeeb_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.habes_shabeeb_ic_launcher_round)
                })
            }
            "mazen_qadee_body" -> {
                view.deputy_tv.setText(R.string.mazen_qadee_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mazen_qadee_ic_launcher_round)
                })
            }

            "sawan_sharafat_body" -> {
                view.deputy_tv.setText(R.string.sawan_sharafat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.sawan_sharafat_ic_launcher_round)
                })
            }
            "sleman_zeben_body" -> {
                view.deputy_tv.setText(R.string.sleman_zeben_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.sleman_zeben_ic_launcher_round)
                })
            }
            "mhasen_shraa_body" -> {
                view.deputy_tv.setText(R.string.mhasen_shraa_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mhasen_shraa_ic_launcher_round)
                })
            }
            "habes_fayez_body" -> {
                view.deputy_tv.setText(R.string.habes_fayez_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.habes_fayez_ic_launcher_round)
                })
            }

            "nawaf_nemat_body" -> {
                view.deputy_tv.setText(R.string.nawaf_nemat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.nawaf_nemat_ic_launcher_round)
                })
            }
            "mohammad_hwetat_body" -> {
                view.deputy_tv.setText(R.string.mohammad_hwetat_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.mohammad_hwetat_ic_launcher_round)
                })
            }
            "awwad_zwaydeh_body" -> {
                view.deputy_tv.setText(R.string.awwad_zwaydeh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.awwad_zwaydeh_ic_launcher_round)
                })
            }
            "demah_tahboob_body" -> {
                view.deputy_tv.setText(R.string.demah_tahboob_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.demah_tahboob_ic_launcher_round)
                })
            }

            "intesar_hejazy_body" -> {
                view.deputy_tv.setText(R.string.intesar_hejazy_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.intesar_hejazy_ic_launcher_round)
                })
            }
            "hya_abbadey_body" -> {
                view.deputy_tv.setText(R.string.hya_abbadey_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hya_abbadey_ic_launcher_round)
                })
            }
            "manal_dmoor_body" -> {
                view.deputy_tv.setText(R.string.manal_dmoor_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.manal_dmoor_ic_launcher_round)
                })
            }
            "ibtisam_nawafleh_body" -> {
                view.deputy_tv.setText(R.string.ibtisam_nawafleh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.ibtisam_nawafleh_ic_launcher_round)
                })
            }

            "hayat_masemy_body" -> {
                view.deputy_tv.setText(R.string.hayat_masemy_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.hayat_masemy_ic_launcher_round)
                })
            }
            "reem_abudalbooh_body" -> {
                view.deputy_tv.setText(R.string.reem_abudalbooh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.reem_abudalbooh_ic_launcher_round)
                })
            }
            "insaf_khawaldeh_body" -> {
                view.deputy_tv.setText(R.string.insaf_khawaldeh_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.insaf_khawaldeh_ic_launcher_round)
                })
            }
            "maram_heesah_body" -> {
                view.deputy_tv.setText(R.string.maram_heesah_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.maram_heesah_ic_launcher_round)
                })
            }

            "wafaa_banimustafa_body" -> {
                view.deputy_tv.setText(R.string.wafaa_banimustafa_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.wafaa_banimustafa_ic_launcher_round)
                })
            }
            "montaha_bool_body" -> {
                view.deputy_tv.setText(R.string.montaha_bool_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.montaha_bool_ic_launcher_round)
                })
            }
            "alia_abuhleyel_body" -> {
                view.deputy_tv.setText(R.string.alia_abuhleyel_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.alia_abuhleyel_ic_launcher_round)
                })
            }
            "zaineb_zbeed_body" -> {
                view.deputy_tv.setText(R.string.zaineb_zbeed_body)
                view.deputy_image.setImageDrawable(this.context?.let {
                    ContextCompat.getDrawable(it,
                            R.mipmap.zaineb_zbeed_ic_launcher_round)
                })
            }
        }

        return view
    }

}// Required empty public constructor
