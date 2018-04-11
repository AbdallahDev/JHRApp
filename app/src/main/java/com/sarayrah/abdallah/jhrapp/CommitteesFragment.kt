package com.sarayrah.abdallah.jhrapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sarayrah.abdallah.jhrapp.adapters.CommitteesAdapter
import com.sarayrah.abdallah.jhrapp.models.CommitteeModel
import kotlinx.android.synthetic.main.fragment_committees.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CommitteesFragment : Fragment() {

    @SuppressLint("Recycle")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_committees, container, false)

        val committesList = ArrayList<CommitteeModel>()

        val obj = JHRDB(this.activity!!)
        val db = obj.readableDatabase
        val cursor = db.rawQuery("select committee_id, committee_name, committee_image from committee", arrayOf())
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            committesList.add(CommitteeModel(cursor.getInt(
                    cursor.getColumnIndex("committee_id")),
                    cursor.getString(
                            cursor.getColumnIndex("committee_name")),
                    cursor.getInt(
                            cursor.getColumnIndex("committee_image"))))
            cursor.moveToNext()
        }

        val adapter = CommitteesAdapter(this.activity!!, committesList)
        view.committees_recyclerView.layoutManager = LinearLayoutManager(this.activity!!)
        view.committees_recyclerView.adapter = adapter

        return view
    }


}
