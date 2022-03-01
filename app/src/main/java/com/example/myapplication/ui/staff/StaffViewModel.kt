package com.example.myapplication.ui.staff

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.StaffData
import com.example.myapplication.network.Client
import kotlinx.coroutines.launch
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
                Log.d(TAG, "${staffDataList.value?.size ?: -1}")
            } catch (e: Exception) {
                Log.d(TAG, "downloadStaff: ${e.message}")
            }
            finally {
                _refreshStatus.value = false
            }
        }
    }

}