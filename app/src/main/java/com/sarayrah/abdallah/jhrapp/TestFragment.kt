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
                "committee.committee_id = 1", arrayOf())
        cursor.moveToFirst()

        v.imageView_test.setImageResource(cursor.getInt(cursor.getColumnIndex("deputy.image")))
        v.textView_test.text = cursor.getString(cursor.getColumnIndex("deputy.name"))

        return v
    }

}// Required empty public constructor
