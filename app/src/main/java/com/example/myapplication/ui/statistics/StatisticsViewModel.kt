package com.example.myapplication.ui.statistics

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.ProcessedReviewData
import com.example.myapplication.data.ReviewData
import com.example.myapplication.network.Client
import kotlinx.coroutines.launch
import java.lang.Exception


const val TAG = "StatisticsViewModel"

class StatisticsViewModel : ViewModel() {
    private val _reviewList: MutableLiveData<List<ProcessedReviewData>> = MutableLiveData(listOf())
    val reviewList: LiveData<List<ProcessedReviewData>>
        get() = _reviewList

    private val _refreshStatus: MutableLiveData<Boolean> = MutableLiveData(false)
    val refreshStatus: LiveData<Boolean>
        get() = _refreshStatus

    private fun convertToProcessedReviewData(list: List<ReviewData>): List<ProcessedReviewData> {
        return list.groupBy { it.category.id }.values.map {
            ProcessedReviewData(
                it[0].category.name,
                (it.sumOf { it.score } / it.size.toDouble()))
        }.toList()
    }

    fun getReviews() {
        viewModelScope.launch {
            _refreshStatus.value = false
            try {
                val rawData = Client.retrofitService.getReviews()
                println(rawData.size)
                _reviewList.value = convertToProcessedReviewData(rawData)
                Log.d(TAG, "${_reviewList.value?.size ?: -1}")
            } catch (e: Exception) {
                Log.d(TAG, "${e.message}")
            } finally {
                _refreshStatus.value = true
            }
        }
    }

}