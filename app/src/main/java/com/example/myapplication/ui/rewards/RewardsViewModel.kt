package com.example.myapplication.ui.rewards

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.BonusData
import com.example.myapplication.network.ApiService
import com.example.myapplication.network.Client
import com.example.myapplication.ui.review.TAG
import kotlinx.coroutines.launch
import java.lang.Exception

const val TAG = "RewardsViewModel"

class RewardsViewModel : ViewModel() {
    private val _bonusesList: MutableLiveData<List<BonusData>> = MutableLiveData(mutableListOf())
    val bonusesList: LiveData<List<BonusData>>
        get() = _bonusesList
    private val _refreshStatus: MutableLiveData<Boolean> = MutableLiveData(false)
    val refreshStatus: LiveData<Boolean>
        get() = _refreshStatus

    fun getBonuses() {
        viewModelScope.launch {
            _refreshStatus.value = true
            try {
                _bonusesList.value = Client.retrofitService.getBonuses()
                Log.d(TAG, "${_bonusesList.value?.size ?: -1}")
            } catch (e: Exception) {
            } finally {
                _refreshStatus.value = false
            }
        }
    }
}