package com.example.myapplication.adapters.rewardsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.DiffUtilData
import com.example.myapplication.adapters.CustomDiffUtil
import com.example.myapplication.data.RewardsData
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textview.MaterialTextView

class RewardsRecyclerAdapter(val context: Context) :
    RecyclerView.Adapter<RewardsRecyclerAdapter.RewardsViewHolder>(), DiffUtilData<RewardsData> {

    override var oldList: List<RewardsData> = emptyList()

    class RewardsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: MaterialTextView = view.findViewById(R.id.name_textview)
        val cardView: MaterialCardView = view.findViewById(R.id.rewards_cardview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RewardsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rewards_item, parent, false)
        return RewardsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RewardsViewHolder, position: Int) {
        holder.nameTextView.text = oldList[position].name
        holder.cardView.setOnClickListener {
            Toast.makeText(
                context,
                context.resources.getString(R.string.prize_received_text),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int = oldList.size


    override fun setData(list: List<RewardsData>) {
        val diff = CustomDiffUtil(oldList, list)
        val diffResult = DiffUtil.calculateDiff(diff)
        oldList = list.map { it.copy() }
        diffResult.dispatchUpdatesTo(this)
    }

}