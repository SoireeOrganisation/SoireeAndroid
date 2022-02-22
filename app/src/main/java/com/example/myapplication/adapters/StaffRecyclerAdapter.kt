package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.StaffData
import com.google.android.material.textview.MaterialTextView

class StaffRecyclerAdapter(private val staffList: List<StaffData>) :
    RecyclerView.Adapter<StaffRecyclerAdapter.ReviewViewHolder>() {

    class ReviewViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: MaterialTextView = view.findViewById(R.id.name_textview)
        val surname: MaterialTextView = view.findViewById(R.id.surname_textview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.staff_item, parent, false)
        return ReviewViewHolder(root)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.name.text = staffList[position].name
        holder.surname.text = staffList[position].surname
    }

    override fun getItemCount() = staffList.size
}