package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sarayrah.abdallah.jhrapp.adapters.CommitteeDeputiesAdapter
import com.sarayrah.abdallah.jhrapp.models.CommitteeDeputyModel
import kotlinx.android.synthetic.main.fragment_committee_deputies.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CommitteeDeputiesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_committee_deputies, container, false)

        val deputiesList = ArrayList<CommitteeDeputyModel>()

        val obj = JHRDB(this.activity!!)
        val db = obj.readableDatabase
        val cursor = db.rawQuery("select committee.committee_name, deputy.name, " +
                "deputy.info, deputy.image " +
                "from committee, deputy, committee_deputy\n" +
                "where\n" +
                "committee.committee_id = committee_deputy.committee_id\n" +
                "and\n" +
                "deputy.id = committee_deputy.deputy_id\n" +
                "and\n" +
                "committee.committee_id = ?", arrayOf(Values.committee_id.toString()))
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            deputiesList.add(CommitteeDeputyModel(
                    cursor.getString(cursor.getColumnIndex("name")),
                    cursor.getString(cursor.getColumnIndex("info")),
                    cursor.getInt(cursor.getColumnIndex("image"))))
            cursor.moveToNext()
        }

        val adapter = CommitteeDeputiesAdapter(this.activity!!, deputiesList)
        view.recyclerView_committee_deputies.layoutManager = LinearLayoutManager(this.activity!!)
        view.recyclerView_committee_deputies.adapter = adapter

        return view
    }


}