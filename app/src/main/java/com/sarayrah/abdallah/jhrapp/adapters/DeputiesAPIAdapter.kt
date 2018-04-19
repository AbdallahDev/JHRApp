package com.sarayrah.abdallah.jhrapp.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sarayrah.abdallah.jhrapp.R
import com.sarayrah.abdallah.jhrapp.models.DeputyAPIModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.deputy_row.view.*

class DeputiesAPIAdapter(val context: Context, private val list: ArrayList<DeputyAPIModel>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.deputy_row, parent,
                false)

        return DeputyView(view)
    }

    class DeputyView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(name: String, image: String) {
            itemView.textView_deputyName.text = name
            if (image != "") {
                Picasso.get().load("http://193.188.88.148/test${image.substring(1)}")
                        .fit().into(itemView.imageView_deputyImage)
            }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as DeputyView).bind(list[position].name, list[position].image)
    }
}