package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.ProcessedReviewData
import com.google.android.material.textview.MaterialTextView

class UserReviewRecyclerAdapter(
    private val context: Context,
    private val list: List<ProcessedReviewData>
) :
    RecyclerView.Adapter<UserReviewRecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: MaterialTextView = view.findViewById(R.id.category_name_textview)
        val scoreTextView: MaterialTextView = view.findViewById(R.id.category_average_textview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.review_item, parent, false)
        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTextView.text = list[position].categoryName
        holder.nameTextView.text =
            context.resources.getString(R.string.average_mark, list[position].average)
    }

    override fun getItemCount() = list.size
}