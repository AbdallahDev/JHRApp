package com.sarayrah.abdallah.jhrapp


import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sarayrah.abdallah.jhrapp.models.CommitteeDeputyModel
import kotlinx.android.synthetic.main.fragment_committee_role.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CommitteeRoleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_committee_role, container, false)

        val obj = JHRDB(this.activity!!)
        val db = obj.readableDatabase
        val cursor = db.rawQuery("select committee_role from committee where committee_id = ?",
                arrayOf(Values.committee_id.toString()))
        cursor.moveToFirst()

        view.textView_committeeRole.text = Html.fromHtml(cursor.getString(cursor.getColumnIndex("committee_role")))

        return view
    }


}
