package com.example.myrecyclerview1test


import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class RecyclerViewAdapter(var content: ArrayList<User>) : RecyclerView.Adapter<RecyclerViewAdapter.Viewholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        //viewholder an view übergeben
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleritem_user, parent, false)
        return Viewholder(view)
    }

    override fun getItemCount(): Int {
        return content.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        //argumenten infos mitgeben
        holder.tvname.text = "${content[position].firstname} ${content[position].name}"
        holder.tvEmail.text = content[position].email
        holder.tvPhone.text = content[position].phone
    }

    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvname: TextView = itemView.findViewById(R.id.fullnameTV)
        var tvEmail: TextView = itemView.findViewById(R.id.emailTV)
        var tvPhone: TextView = itemView.findViewById(R.id.numberTV)
    }
}

