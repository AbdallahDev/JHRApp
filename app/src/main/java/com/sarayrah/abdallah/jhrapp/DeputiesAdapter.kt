package com.sarayrah.abdallah.jhrapp

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.deputy_row.view.*


class DeputiesAdapter(private var context: Context, private var list: ArrayList<DeputyModel>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.deputy_row, parent,
                false)

        return DeputyView(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("CommitTransaction")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as DeputyView).bind(list[position].name, list[position].image)

        holder.itemView.imageView_deputy.setOnClickListener {
            Values.deputy_name = list[position].name
            Values.deputy_info = list[position].info
            Values.deputy_image = list[position].image
            val tr = (context as AppCompatActivity).supportFragmentManager
                    .beginTransaction()
            val obj = DeputyInfoFragment()
            tr?.replace(R.id.fc, obj)?.addToBackStack(DeputyInfoFragment().tag)?.commit()
        }
    }

    class DeputyView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bind(nm: String, img: Int) {
            itemView.imageView_deputy.setImageResource(img)
            itemView.textView_deputyName.text = "النائب $nm"
        }
    }
}