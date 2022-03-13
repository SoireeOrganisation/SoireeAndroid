package com.example.myapplication.ui.staff

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.StaffData
import com.example.myapplication.network.Client
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception


class ReviewViewModel : ViewModel() {
    private val _staffDataList: MutableLiveData<MutableList<StaffData>> =
        MutableLiveData(mutableListOf())
    val staffDataList: LiveData<MutableList<StaffData>>
        get() = _staffDataList
    private val _refreshStatus: MutableLiveData<Boolean> = MutableLiveData(false)
    val refreshStatus: LiveData<Boolean>
        get() = _refreshStatus

    var firstDownload = true
        private set

    fun removeWithId(id: Int) {
        _staffDataList.value?.removeIf { it.id == id }
    }

    fun downloadStaff() {
        firstDownload = false
        viewModelScope.launch {
            _refreshStatus.value = true
            try {
                _staffDataList.value = Client.retrofitService.getStaff().toMutableList()
                Timber.d("viewModelData: ${_staffDataList.value!![0]}")
            } catch (e: Exception) {
                Timber.d("downloadStaff: ${e.message}")
            } finally {
                _refreshStatus.value = false
            }
        }
    }

}