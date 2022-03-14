package com.example.myapplication.adapters.rewardsAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.DiffUtilData
import com.example.myapplication.adapters.CustomDiffUtil
import com.example.myapplication.data.RewardsData
import com.google.android.material.textview.MaterialTextView

class RewardsRecyclerAdapter(
) :
    RecyclerView.Adapter<RewardsRecyclerAdapter.RewardsViewHolder>(), DiffUtilData<RewardsData> {

    override var oldList : List<RewardsData> = emptyList()

    class RewardsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: MaterialTextView = view.findViewById(R.id.name_textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RewardsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.rewards_item, parent, false)
        return RewardsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RewardsViewHolder, position: Int) {
        holder.nameTextView.text = oldList[position].name
    }

    override fun getItemCount(): Int = oldList.size
    

    override fun setData(list: List<RewardsData>) {
        val diff = CustomDiffUtil(oldList, list)
        val diffResult = DiffUtil.calculateDiff(diff)
        oldList = list.map { it.copy() }
        diffResult.dispatchUpdatesTo(this)
    }

}