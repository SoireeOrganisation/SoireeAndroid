package com.example.myapplication.adapters.staffAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapters.DiffUtilData
import com.example.myapplication.adapters.CustomDiffUtil
import com.example.myapplication.data.StaffData
import com.example.myapplication.ui.staff.StaffFragmentDirections
import com.google.android.material.textview.MaterialTextView
import timber.log.Timber

class StaffRecyclerAdapter() :
    RecyclerView.Adapter<StaffRecyclerAdapter.ReviewViewHolder>(), DiffUtilData<StaffData> {



    override var oldList: List<StaffData> = emptyList()

    class ReviewViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val name: MaterialTextView = view.findViewById(R.id.name_textview)
        val surname: MaterialTextView = view.findViewById(R.id.surname_textview)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.staff_item, parent, false)
        return ReviewViewHolder(root)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.name.text = oldList[position].name
        holder.surname.text = oldList[position].surname
        Timber.d("oldStaff: $oldList")
        holder.itemView.setOnClickListener {
            val action =
                StaffFragmentDirections.actionReviewFragmentToRateFragment(workerData = oldList[position])
            holder.view.findNavController().navigate(action)
        }
        Timber.d("{myData ${oldList[position]}}")
    }

    override fun getItemCount() = oldList.size

    override fun setData(list: List<StaffData>) {
        val diff = CustomDiffUtil(oldList, list)
        val diffResult = DiffUtil.calculateDiff(diff)
        oldList = list.map { it.copy() }
        diffResult.dispatchUpdatesTo(this)
    }
}