package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.sarayrah.abdallah.jhrapp.adapters.DeputiesAPIAdapter
import com.sarayrah.abdallah.jhrapp.models.DeputyAPIModel
import kotlinx.android.synthetic.main.fragment_deputies_api.*
import kotlinx.android.synthetic.main.fragment_deputies_api.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DeputiesAPIFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_deputies_api, container,
                false)

        val deputiesList = ArrayList<DeputyAPIModel>()

        val rq = Volley.newRequestQueue(this.activity!!)
        val jar = JsonArrayRequest(Request.Method.GET, "http://193.188.88.148/test",
                null, Response.Listener { response ->
            for (index in 0 until response.length()) {
                deputiesList.add(DeputyAPIModel(
                        response.getJSONObject(index).getString("RepresentativeName"),
                        response.getJSONObject(index).getString("fldPhoto")))
            }

            val adapter = DeputiesAPIAdapter(this.activity!!, deputiesList)
            view.deputiesAPI_recyclerView.layoutManager = LinearLayoutManager(this.activity!!)
            view.deputiesAPI_recyclerView.adapter = adapter
        },
                Response.ErrorListener { error ->
                    Toast.makeText(this.activity!!, error.message, Toast.LENGTH_LONG).show()
                })
        rq.add(jar)

        return view
    }


}
