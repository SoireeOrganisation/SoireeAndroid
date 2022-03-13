package com.example.myapplication.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.myapplication.data.StaffData
import javax.security.auth.callback.Callback

class StaffDiffUtil(private val oldList: List<StaffData>, private val newList: List<StaffData>) :
    DiffUtil.Callback() {
    override fun getOldListSize() = oldList.size


    override fun getNewListSize() = newList.size


    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val old = oldList[oldItemPosition]
        val new = newList[newItemPosition]
        return old.id == new.id && old.company == new.company && old.name == old.name &&
                old.surname == new.surname && old.patronymic == new.patronymic
    }
}