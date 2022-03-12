package com.example.myapplication.ui.staff

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.StaffData
import com.example.myapplication.network.Client
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception

const val TAG = "ReviewViewModel"

class ReviewViewModel : ViewModel() {
    private val _staffDataList: MutableLiveData<List<StaffData>> = MutableLiveData(mutableListOf())
    val staffDataList: LiveData<List<StaffData>>
        get() = _staffDataList
    private val _refreshStatus: MutableLiveData<Boolean> = MutableLiveData(false)
    val refreshStatus: LiveData<Boolean>
        get() = _refreshStatus

    fun downloadStaff() {
        viewModelScope.launch {
            _refreshStatus.value = true
            try {
                _staffDataList.value = Client.retrofitService.getStaff()
                Timber.d("viewModelData: ${ _staffDataList.value!![0]}")
            } catch (e: Exception) {
                Timber.d("downloadStaff: ${e.message}")
            }
            finally {
                _refreshStatus.value = false
            }
        }
    }

}