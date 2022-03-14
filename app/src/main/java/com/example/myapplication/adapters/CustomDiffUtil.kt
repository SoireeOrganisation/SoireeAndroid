package com.example.myapplication.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.myapplication.data.ProcessedReviewData
import com.example.myapplication.data.RewardsData
import com.example.myapplication.data.StaffData

class CustomDiffUtil<T>(private val oldList: List<T>, private val newList: List<T>) :
    DiffUtil.Callback() {
    override fun getOldListSize() = oldList.size


    override fun getNewListSize() = newList.size


    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        when (oldList[oldItemPosition]) {
            is StaffData -> {
                val old = oldList[oldItemPosition] as StaffData
                val new = newList[newItemPosition] as StaffData
                return old.id == new.id
            }
            is RewardsData -> {
                val old = oldList[oldItemPosition] as RewardsData
                val new = newList[newItemPosition] as RewardsData
                return old.id == new.id
            }
            is ProcessedReviewData -> {
                val old = oldList[oldItemPosition] as ProcessedReviewData
                val new = newList[newItemPosition] as ProcessedReviewData
                return old.id == new.id
            }
            else -> {
                throw NotImplementedError("error")
            }
        }
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        when (oldList[oldItemPosition]) {
            is StaffData -> {
                val old = oldList[oldItemPosition] as StaffData
                val new = newList[newItemPosition] as StaffData
                return old.id == new.id && old.company == new.company && old.name == old.name &&
                        old.surname == new.surname && old.patronymic == new.patronymic
            }
            is RewardsData -> {
                val old = oldList[oldItemPosition] as RewardsData
                val new = newList[newItemPosition] as RewardsData
                return old.id == new.id && old.name == new.name
            }
            is ProcessedReviewData -> {
                val old = oldList[oldItemPosition] as ProcessedReviewData
                val new = newList[newItemPosition] as ProcessedReviewData
                return old.id == new.id && old.average == new.average && old.categoryName == new.categoryName
            }
            else -> {
                throw NotImplementedError("error")
            }
        }
    }
}