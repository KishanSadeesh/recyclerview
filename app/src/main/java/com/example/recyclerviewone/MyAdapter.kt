package com.example.recyclerviewone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val mylist: ArrayList<Dataclassone>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerviewcardone,parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem = mylist[position]
        holder.titleimage.setImageResource(currentItem.myImage)
        holder.titletext.text = currentItem.myTitle
    }

    override fun getItemCount(): Int {
        return mylist.size
    }

    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val titleimage : ImageView = itemView.findViewById(R.id.image)
        val titletext : TextView = itemView.findViewById(R.id.title)
    }

}