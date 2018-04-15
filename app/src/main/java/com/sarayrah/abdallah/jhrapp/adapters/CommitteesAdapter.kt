package com.sarayrah.abdallah.jhrapp.adapters

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sarayrah.abdallah.jhrapp.*
import com.sarayrah.abdallah.jhrapp.models.CommitteeModel
import kotlinx.android.synthetic.main.committee_row.view.*
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent



class CommitteesAdapter(val context: Context, private val list: ArrayList<CommitteeModel>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.committee_row, parent,
                false)

        return CommitteeView(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as CommitteeView).bind(list[position].committeeName, list[position].committeeImage)

        holder.itemView.committee_row.setOnClickListener {
            //bellow i store the values from the list in the committee_id static variable to
            //decide the deputies related to the selected committee
            Values.committee_id = list[position].committeeId

            val intent = Intent(context, CommitteeInfoActivity::class.java)
            context.startActivity(intent)
        }
    }

    class CommitteeView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(nm: String, img: Int) {
            itemView.textView_committeeName.text = nm
            itemView.imageView_committeeImage.setImageResource(img)
        }
    }
}