package com.example.tp4exo4

import android.view.LayoutInflater
import  android.widget.Adapter
import  android.view.View
import android.view.ViewGroup
import android.widget.TextView
import  androidx.recyclerview.widget.RecyclerView

class recyclerViewAdapter (val seanceList:ArrayList<seanceDataModel>, var itemClickListener: OnItemClickListener):
    RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return seanceList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var seance: seanceDataModel = seanceList[position]
        holder.title.text=seance.title

        holder.bind(seance,itemClickListener)
       }

    class  ViewHolder(item:View) :RecyclerView.ViewHolder(item){
        var title:TextView = item.findViewById(R.id.seance_name)

        fun bind(seance:seanceDataModel, clickListener: OnItemClickListener){
            title.text=seance.title

            itemView.setOnClickListener{
                clickListener.onItemClick(seance)
            }
        }

    }

    interface OnItemClickListener{
        fun onItemClick(seance: seanceDataModel)
    }

}