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

    var firstDownload = true
        private set


    private fun convertToProcessedReviewData(list: List<ReviewData>): List<ProcessedReviewData> {
        return list.groupBy { it.category.id }.values.map {
            ProcessedReviewData(
                it[0].category.name,
                (it.sumOf { it.score } / it.size.toDouble()))
        }.toList()
    }

    fun getReviews() {
        firstDownload = false
        viewModelScope.launch {
            _refreshStatus.value = true
            try {
                val rawData = Client.retrofitService.getReviews()
                println(rawData.size)
                _reviewList.value = convertToProcessedReviewData(rawData)
            } catch (e: Exception) {
                }
            finally {
                _refreshStatus.value = false
            }
        }
    }

}