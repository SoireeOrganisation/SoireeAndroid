package com.example.myapplication.ui.review

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.data.StaffData

class ReviewViewModelFactory(val staff: StaffData) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ReviewViewModel::class.java)) {
            return ReviewViewModel(staff) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}