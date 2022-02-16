package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.RewardsData
import com.google.android.material.textview.MaterialTextView

class RewardsRecyclerAdapter(
    private val context: Context,
    private val listOfRewards: List<RewardsData>
) :
    RecyclerView.Adapter<RewardsRecyclerAdapter.RewardsViewHolder>() {
    class RewardsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView = view.findViewById<MaterialTextView>(R.id.name_textview)
        val priceTextView = view.findViewById<MaterialTextView>(R.id.price_textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RewardsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rewards_item, parent, false)
        return RewardsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RewardsViewHolder, position: Int) {
        holder.nameTextView.text = listOfRewards[position].name
        holder.priceTextView.text =
            (context.resources.getString(
                R.string.your_points,
                listOfRewards[position].price.toString()
            ))
    }

    override fun getItemCount(): Int = listOfRewards.size
}