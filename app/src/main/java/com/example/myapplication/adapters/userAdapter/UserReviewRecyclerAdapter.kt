package com.example.myapplication.adapters.userAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.CustomDiffUtil
import com.example.myapplication.adapters.DiffUtilData
import com.example.myapplication.data.ProcessedReviewData
import com.google.android.material.textview.MaterialTextView

class UserReviewRecyclerAdapter(
    private val context: Context,
) :
    RecyclerView.Adapter<UserReviewRecyclerAdapter.ViewHolder>(),
    DiffUtilData<ProcessedReviewData> {


    override var oldList: List<ProcessedReviewData> = emptyList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: MaterialTextView = view.findViewById(R.id.category_name_textview)
        val scoreTextView: MaterialTextView = view.findViewById(R.id.category_average_textview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.review_item, parent, false)
        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = oldList[position].categoryName + ':'
        holder.scoreTextView.text =
            context.resources.getString(R.string.average_mark, oldList[position].average)
    }

    override fun getItemCount() = oldList.size

    override fun setData(list: List<ProcessedReviewData>) {
        val diff = CustomDiffUtil(oldList, list)
        val diffResult = DiffUtil.calculateDiff(diff)
        oldList = list.map { it.copy() }
        diffResult.dispatchUpdatesTo(this)
    }
}