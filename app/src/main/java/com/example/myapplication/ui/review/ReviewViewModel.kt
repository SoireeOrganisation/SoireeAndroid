package com.example.myapplication.ui.review

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.Category
import com.example.myapplication.data.Rate
import com.example.myapplication.data.StaffData
import com.example.myapplication.data.StaffRates
import com.example.myapplication.network.Client
import com.example.myapplication.network.DEBUG_KEY
import com.example.myapplication.network.DataResponseState
import com.example.myapplication.network.ResponseState
import kotlinx.coroutines.launch
import timber.log.Timber


class ReviewViewModel(val staffData: StaffData) : ViewModel() {
    private val _categoriesList: MutableLiveData<List<Category>> = MutableLiveData(mutableListOf())
    val categoriesList: LiveData<List<Category>>
        get() = _categoriesList

    var responseState: MutableLiveData<ResponseState> = MutableLiveData(ResponseState.NONE)
        private set(value) {
            field = value
        }

    var dataResponseState: MutableLiveData<DataResponseState> =
        MutableLiveData(DataResponseState.NONE)
        private set(value) {
            field = value
        }

    fun getCategories() {
        viewModelScope.launch {
            dataResponseState.value = DataResponseState.LOADING
            Timber.d("getting categories...")
            try {
                _categoriesList.value = Client.retrofitService.getCategories()
                dataResponseState.value = DataResponseState.FULL
            } catch (e: Exception) {
                Timber.d(e)
                dataResponseState.value = DataResponseState.ERROR
            }
        }
    }

    fun postMarks(rawRates: List<Int>) {
        require(categoriesList.value != null)
        responseState.value = ResponseState.LOADING
        viewModelScope.launch {
            Timber.d("posting marks...")
            try {
                val marksList = mutableListOf<Rate>()
                for (i in rawRates.indices) {
                    marksList.add(Rate(categoriesList.value!![i].id, "", 2 * rawRates[i]))
                }
                val data = StaffRates(DEBUG_KEY, marksList, staffData.id)

                val response = Client.retrofitService.postMarks(data)
                Timber.d("response ${response.body()}")
                if (response.isSuccessful) {
                    responseState.value = ResponseState.SUCCESSFUL
                } else {
                    responseState.value = ResponseState.ERROR
                }

            } catch (e: Exception) {
                Timber.d(e)
                responseState.value = ResponseState.ERROR
            }
        }
        Timber.d("Post done successful")
    }

}