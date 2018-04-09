package com.sarayrah.abdallah.jhrapp


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_deputies_db.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DeputiesDBFragment : Fragment() {

    @SuppressLint("Recycle")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_deputies_db, container,
                false)

        val deputiesList = ArrayList<DeputyModel>()

        val obj = JHRDB(this.activity!!)
        val db = obj.readableDatabase
        val cursor = db.rawQuery("select name, image from deputy", arrayOf())
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            deputiesList.add(DeputyModel(cursor.getString(cursor.getColumnIndex("name")),
                    cursor.getInt(cursor.getColumnIndex("image"))))
            cursor.moveToNext()
        }

        val adapter = DeputiesAdapter(this.activity!!, deputiesList)
        view.deputies_recyclerView.layoutManager = LinearLayoutManager(this.activity!!)
        view.deputies_recyclerView.adapter = adapter

        return view
    }


}
