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
        view.ahmed_reqeb.setOnClickListener {
            Values.deputy_name = "ahmed_reqeb_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ahmed_hamesat.setOnClickListener {
            Values.deputy_name = "ahmed_hamesat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ramadan_hunaiti.setOnClickListener {
            Values.deputy_name = "ramadan_hunaiti_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.nassar_qaisi.setOnClickListener {
            Values.deputy_name = "nassar_qaisi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.fadil_abadi.setOnClickListener {
            Values.deputy_name = "fadil_abadi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ahmed_lozi.setOnClickListener {
            Values.deputy_name = "ahmed_lozi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.tamer_pino.setOnClickListener {
            Values.deputy_name = "tamer_pino_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mostafa_assaf.setOnClickListener {
            Values.deputy_name = "mostafa_assaf_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.hasan_ajarma.setOnClickListener {
            Values.deputy_name = "hasan_ajarma_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.barakat_abadi.setOnClickListener {
            Values.deputy_name = "barakat_abadi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.riad_azzam.setOnClickListener {
            Values.deputy_name = "riad_azzam_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.rashed_shouha.setOnClickListener {
            Values.deputy_name = "rashed_shouha_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdulmoneim_oudat.setOnClickListener {
            Values.deputy_name = "abdulmoneim_oudat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mahmoud_titi.setOnClickListener {
            Values.deputy_name = "mahmoud_titi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ibrahim_hani.setOnClickListener {
            Values.deputy_name = "ibrahim_hani_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.nidal_taani.setOnClickListener {
            Values.deputy_name = "nidal_taani_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.joudat_darabsa.setOnClickListener {
            Values.deputy_name = "joudat_darabsa_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khaled_hassan.setOnClickListener {
            Values.deputy_name = "khaled_hassan_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.fawaz_zoubi.setOnClickListener {
            Values.deputy_name = "fawaz_zoubi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdullah_obaidat.setOnClickListener {
            Values.deputy_name = "abdullah_obaidat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.wael_razouk.setOnClickListener {
            Values.deputy_name = "wael_razouk_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.hosny_shyab.setOnClickListener {
            Values.deputy_name = "hosny_shyab_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mostafa_alkhasawneh.setOnClickListener {
            Values.deputy_name = "mostafa_alkhasawneh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.yousef_jarrah.setOnClickListener {
            Values.deputy_name = "yousef_jarrah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.issa_khashashna.setOnClickListener {
            Values.deputy_name = "issa_khashashna_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.hamed_saqour.setOnClickListener {
            Values.deputy_name = "hamed_saqour_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.majed_qweism.setOnClickListener {
            Values.deputy_name = "majed_qweism_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khaled_bashtawi.setOnClickListener {
            Values.deputy_name = "khaled_bashtawi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ibrahim_quran.setOnClickListener {
            Values.deputy_name = "ibrahim_quran_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.moataz_rumman.setOnClickListener {
            Values.deputy_name = "moataz_rumman_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.jamal_gammoh.setOnClickListener {
            Values.deputy_name = "jamal_gammoh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohammed_zoubi.setOnClickListener {
            Values.deputy_name = "mohammed_zoubi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.dawzy_dawood.setOnClickListener {
            Values.deputy_name = "dawzy_dawood_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ali_hajjaja.setOnClickListener {
            Values.deputy_name = "ali_hajjaja_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mustafa_yaghi.setOnClickListener {
            Values.deputy_name = "mustafa_yaghi_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ibrahim_sayed.setOnClickListener {
            Values.deputy_name = "ibrahim_sayed_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khaled_hayari.setOnClickListener {
            Values.deputy_name = "khaled_hayari_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.fadeyh_dayat.setOnClickListener {
            Values.deputy_name = "fadeyh_dayat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mahmoud_adwan.setOnClickListener {
            Values.deputy_name = "mahmoud_adwan_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.atef_tarawneh.setOnClickListener {
            Values.deputy_name = "atef_tarawneh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.raja_sarayra.setOnClickListener {
            Values.deputy_name = "raja_sarayra_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdullah_zureikat.setOnClickListener {
            Values.deputy_name = "abdullah_zureikat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.haitham_ziadin.setOnClickListener {
            Values.deputy_name = "haitham_ziadin_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.musleh_tarawneh.setOnClickListener {
            Values.deputy_name = "musleh_tarawneh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohammed_ataiqa.setOnClickListener {
            Values.deputy_name = "mohammed_ataiqa_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mahmoud_naimat.setOnClickListener {
            Values.deputy_name = "mahmoud_naimat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.sadah_habashneh.setOnClickListener {
            Values.deputy_name = "sadah_habashneh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.randa_shaar.setOnClickListener {
            Values.deputy_name = "randa_shaar_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.sabah_shaar.setOnClickListener {
            Values.deputy_name = "sabah_shaar_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdullah_qaramsah.setOnClickListener {
            Values.deputy_name = "abdullah_qaramsah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohamed_falahat.setOnClickListener {
            Values.deputy_name = "mohamed_falahat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ibrahim_bdoor.setOnClickListener {
            Values.deputy_name = "ibrahim_bdoor_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.khaled_fanatsah.setOnClickListener {
            Values.deputy_name = "khaled_fanatsah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.tariq_khorey.setOnClickListener {
            Values.deputy_name = "tariq_khorey_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.mohammad_thahraoy.setOnClickListener {
            Values.deputy_name = "mohammad_thahraoy_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohammad_nooh.setOnClickListener {
            Values.deputy_name = "mohammad_nooh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.saoud_mahfooth.setOnClickListener {
            Values.deputy_name = "saoud_mahfooth_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.nabeel_sheshaney.setOnClickListener {
            Values.deputy_name = "nabeel_sheshaney_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.qosai_dmesey.setOnClickListener {
            Values.deputy_name = "qosai_dmesey_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.faysal_aoar.setOnClickListener {
            Values.deputy_name = "faysal_aoar_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.marzooq_daaja.setOnClickListener {
            Values.deputy_name = "marzooq_daaja_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.hmood_zwahra.setOnClickListener {
            Values.deputy_name = "hmood_zwahra_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.mosa_zoahra.setOnClickListener {
            Values.deputy_name = "mosa_zoahra_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.nwaf_zeod.setOnClickListener {
            Values.deputy_name = "nwaf_zeod_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ali_khlaylah.setOnClickListener {
            Values.deputy_name = "ali_khlaylah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdkareem_dogmy.setOnClickListener {
            Values.deputy_name = "abdkareem_dogmy_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.rayed_khazalah.setOnClickListener {
            Values.deputy_name = "rayed_khazalah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mofleh_khazalah.setOnClickListener {
            Values.deputy_name = "mofleh_khazalah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.shoaeb_shodefat.setOnClickListener {
            Values.deputy_name = "shoaeb_shodefat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mahmood_fraheed.setOnClickListener {
            Values.deputy_name = "mahmood_fraheed_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.hasan_soud.setOnClickListener {
            Values.deputy_name = "hasan_soud_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.hoseen_qesey.setOnClickListener {
            Values.deputy_name = "hoseen_qesey_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ghazey_hwamleh.setOnClickListener {
            Values.deputy_name = "ghazey_hwamleh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.abdqader_azaydah.setOnClickListener {
            Values.deputy_name = "abdqader_azaydah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.nabeel_geshan.setOnClickListener {
            Values.deputy_name = "nabeel_geshan_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.adnaan_rkeebat.setOnClickListener {
            Values.deputy_name = "adnaan_rkeebat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.zeed_shawabkah.setOnClickListener {
            Values.deputy_name = "zeed_shawabkah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohammad_hdeeb.setOnClickListener {
            Values.deputy_name = "mohammad_hdeeb_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.huda_otoom.setOnClickListener {
            Values.deputy_name = "huda_otoom_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.oqlah_zboon.setOnClickListener {
            Values.deputy_name = "oqlah_zboon_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohammad_ayasrah.setOnClickListener {
            Values.deputy_name = "mohammad_ayasrah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.kamal_zgool.setOnClickListener {
            Values.deputy_name = "kamal_zgool_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.wasfee_haddad.setOnClickListener {
            Values.deputy_name = "wasfee_haddad_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.safa_momany.setOnClickListener {
            Values.deputy_name = "safa_momany_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ahmad_freehat.setOnClickListener {
            Values.deputy_name = "ahmad_freehat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohammad_reyatee.setOnClickListener {
            Values.deputy_name = "mohammad_reyatee_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.hazem_majali.setOnClickListener {
            Values.deputy_name = "hazem_majali_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ibraheem_abuez.setOnClickListener {
            Values.deputy_name = "ibraheem_abuez_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.habes_shabeeb.setOnClickListener {
            Values.deputy_name = "habes_shabeeb_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mazen_qadee.setOnClickListener {
            Values.deputy_name = "mazen_qadee_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.sawan_sharafat.setOnClickListener {
            Values.deputy_name = "sawan_sharafat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.sleman_zeben.setOnClickListener {
            Values.deputy_name = "sleman_zeben_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mhasen_shraa.setOnClickListener {
            Values.deputy_name = "mhasen_shraa_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.habes_fayez.setOnClickListener {
            Values.deputy_name = "habes_fayez_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.nawaf_nemat.setOnClickListener {
            Values.deputy_name = "nawaf_nemat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.mohammad_hwetat.setOnClickListener {
            Values.deputy_name = "mohammad_hwetat_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.awwad_zwaydeh.setOnClickListener {
            Values.deputy_name = "awwad_zwaydeh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.demah_tahboob.setOnClickListener {
            Values.deputy_name = "demah_tahboob_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.intesar_hejazy.setOnClickListener {
            Values.deputy_name = "intesar_hejazy_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.hya_abbadey.setOnClickListener {
            Values.deputy_name = "hya_abbadey_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.manal_dmoor.setOnClickListener {
            Values.deputy_name = "manal_dmoor_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.ibtisam_nawafleh.setOnClickListener {
            Values.deputy_name = "ibtisam_nawafleh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.hayat_masemy.setOnClickListener {
            Values.deputy_name = "hayat_masemy_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.reem_abudalbooh.setOnClickListener {
            Values.deputy_name = "reem_abudalbooh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.insaf_khawaldeh.setOnClickListener {
            Values.deputy_name = "insaf_khawaldeh_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.maram_heesah.setOnClickListener {
            Values.deputy_name = "maram_heesah_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        view.wafaa_banimustafa.setOnClickListener {
            Values.deputy_name = "wafaa_banimustafa_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.montaha_bool.setOnClickListener {
            Values.deputy_name = "montaha_bool_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.alia_abuhleyel.setOnClickListener {
            Values.deputy_name = "alia_abuhleyel_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }
        view.zaineb_zbeed.setOnClickListener {
            Values.deputy_name = "zaineb_zbeed_body"
            val tr = fragmentManager?.beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)
            tr?.commit()
        }

        return view
    }

}// Required empty public constructor
