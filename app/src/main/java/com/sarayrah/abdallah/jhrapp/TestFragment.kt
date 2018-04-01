package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.text.Html
import android.R.attr.name
import kotlinx.android.synthetic.main.fragment_test.view.*


/**
 * A simple [Fragment] subclass.
 */
class TestFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_test, container, false)

        val sourceString = "<b>اللقب:</b> سعادة النائب"
        v.mytextview.text = Html.fromHtml(sourceString)

        return v
    }

}// Required empty public constructor
