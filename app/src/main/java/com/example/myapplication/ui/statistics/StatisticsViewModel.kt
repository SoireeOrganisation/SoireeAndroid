package com.example.myapplication.ui.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.ProcessedReviewData
import com.example.myapplication.data.ReviewData
import com.example.myapplication.network.Client
import com.example.myapplication.network.DataResponseState
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception


class StatisticsViewModel : ViewModel() {
    private val _reviewList: MutableLiveData<List<ProcessedReviewData>> = MutableLiveData(listOf())
    val reviewList: LiveData<List<ProcessedReviewData>>
        get() = _reviewList

    private val _responseStatus: MutableLiveData<DataResponseState> =
        MutableLiveData(DataResponseState.NONE)
    val responseStatus: LiveData<DataResponseState>
        get() = _responseStatus

    var firstDownload = true
        private set


    private fun convertToProcessedReviewData(list: List<ReviewData>): List<ProcessedReviewData> {
        return list.groupBy { it.category.id }.values.map {
            ProcessedReviewData(it[0].category.id,
                it[0].category.name,
                (it.sumOf { it.score } / it.size.toDouble()))
        }.toList()
    }

    fun getReviews() {
        firstDownload = false
        viewModelScope.launch {
            _responseStatus.value = DataResponseState.LOADING
            try {
                val rawData = Client.retrofitService.getReviews()
                println(rawData.size)
                _reviewList.value = convertToProcessedReviewData(rawData)
                if (_reviewList.value?.size ?: 0 == 0)
                    _responseStatus.value = DataResponseState.EMPTY
                else
                    _responseStatus.value = DataResponseState.FULL
            } catch (e: Exception) {
                Timber.d("Error while debug: $e")
                _responseStatus.value = DataResponseState.ERROR
            }
        }
    }

}