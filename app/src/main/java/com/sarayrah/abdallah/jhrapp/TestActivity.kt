package com.sarayrah.abdallah.jhrapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val tr = Volley.newRequestQueue(this)
        val jar = JsonArrayRequest(Request.Method.GET, "http://169.254.145.182/test", null,
                Response.Listener { response ->
                    Picasso.get().load("")
                }, Response.ErrorListener { error ->
            Toast.makeText(this, error.message, Toast.LENGTH_LONG).show()
        })
        tr.add(jar)
    }

}
