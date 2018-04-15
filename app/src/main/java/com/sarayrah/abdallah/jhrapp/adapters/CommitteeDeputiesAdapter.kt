package com.sarayrah.abdallah.jhrapp.adapters

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sarayrah.abdallah.jhrapp.DeputyInfoDBFragment
import com.sarayrah.abdallah.jhrapp.R
import com.sarayrah.abdallah.jhrapp.Values
import com.sarayrah.abdallah.jhrapp.models.CommitteeDeputyModel
import kotlinx.android.synthetic.main.deputy_row.view.*

class CommitteeDeputiesAdapter(val context: Context, private val list: ArrayList<CommitteeDeputyModel>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.deputy_row, parent,
                false)
        return CommitteeDeputyView(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as CommitteeDeputyView).bind(list[position].deputyName, list[position].deputyImage)

        holder.itemView.layout_deputy.setOnClickListener {
            //bellow i store the values from the list in the static variables to be used later
            //in the other pages, like the deputyInfoDBFragment page
            Values.deputy_info = list[position].deputyInfo
            Values.deputy_image = list[position].deputyImage

            val tr = (context as AppCompatActivity).supportFragmentManager
                    .beginTransaction()
            val obj = DeputyInfoDBFragment()
            tr?.replace(R.id.fc, obj)?.addToBackStack(DeputyInfoDBFragment().tag)?.commit()
        }
    }

    class CommitteeDeputyView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(nm: String, img: Int) {
            itemView.textView_deputyName.text = nm
            itemView.imageView_deputyImage.setImageResource(img)
        }
    }
}