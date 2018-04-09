package com.sarayrah.abdallah.jhrapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DeputiesAdapter(context: Context, list: ArrayList<DeputyModel>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.deputy_row, parent, false)

        return
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class DeputyView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(nm: String, inf: String, img: Int) {
            itemView.
        }
    }
}