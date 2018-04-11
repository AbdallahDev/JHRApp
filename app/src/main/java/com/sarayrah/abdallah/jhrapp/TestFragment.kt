package com.sarayrah.abdallah.jhrapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.deputy_row.*
import kotlinx.android.synthetic.main.fragment_test.*
import kotlinx.android.synthetic.main.fragment_test.view.*


/**
 * A simple [Fragment] subclass.
 */
class TestFragment : Fragment() {


    @SuppressLint("Recycle")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_test, container, false)

        var namesList = ""

        val obj = JHRDB(this.activity!!)
        val db = obj.readableDatabase
        val cursor = db.rawQuery("select committee.committee_name, deputy.name, " +
                "deputy.image " +
                "from committee, deputy, committee_deputy\n" +
                "where\n" +
                "committee.committee_id = committee_deputy.committee_id\n" +
                "and\n" +
                "deputy.id = committee_deputy.deputy_id\n" +
                "and\n" +
                "committee.committee_id = ?", arrayOf(Values.committee_id.toString()))
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            namesList += cursor.getInt(cursor.getColumnIndex("image")).toString() + " "
            cursor.moveToNext()
        }

        v.textView_test.text = namesList
        return v
    }

}// Required empty public constructor
