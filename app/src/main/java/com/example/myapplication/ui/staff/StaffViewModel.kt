package com.example.myapplication.ui.staff

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.StaffData
import com.example.myapplication.network.Client
import com.example.myapplication.network.DataResponseState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception


class ReviewViewModel : ViewModel() {
    private val _staffDataList: MutableLiveData<MutableList<StaffData>> =
        MutableLiveData(mutableListOf())
    val staffDataList: LiveData<MutableList<StaffData>>
        get() = _staffDataList
    private val _responseStatus: MutableLiveData<DataResponseState> =
        MutableLiveData(DataResponseState.NONE)
    val responseStatus: LiveData<DataResponseState>
        get() = _responseStatus

    var firstDownload = true
        private set

    fun removeWithId(id: Int) {
        _staffDataList.value?.removeIf { it.id == id }
        if (_staffDataList.value?.size ?: 0 == 0)
            _responseStatus.value = DataResponseState.EMPTY
        else
            _responseStatus.value = DataResponseState.FULL
    }

    fun downloadStaff() {

        viewModelScope.launch {
            if (firstDownload)
                delay(1)
            firstDownload = false
            _responseStatus.value = DataResponseState.LOADING
            try {
                _staffDataList.value = Client.retrofitService.getStaff().toMutableList()
                Timber.d("viewModelData: ${_staffDataList.value!![0]}")
                if (_staffDataList.value?.size ?: 0 == 0)
                    _responseStatus.value = DataResponseState.EMPTY
                else
                    _responseStatus.value = DataResponseState.FULL
            } catch (e: Exception) {
                Timber.d("downloadStaff: ${e.message}")
                _responseStatus.value = DataResponseState.ERROR
            }
        }
    }

}