package com.example.myapplication.ui.rewards

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.BonusData
import com.example.myapplication.network.Client
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception


class RewardsViewModel : ViewModel() {
    private val _bonusesList: MutableLiveData<List<BonusData>> = MutableLiveData(mutableListOf())
    val bonusesList: LiveData<List<BonusData>>
        get() = _bonusesList
    private val _refreshStatus: MutableLiveData<Boolean> = MutableLiveData(false)
    val refreshStatus: LiveData<Boolean>
        get() = _refreshStatus

    var firstDownload = true
        private set

    fun getBonuses() {
        firstDownload = false
        viewModelScope.launch {
            _refreshStatus.value = true
            try {
                _bonusesList.value = Client.retrofitService.getBonuses()
                Timber.d("${_bonusesList.value?.size ?: -1}")
            } catch (e: Exception) {
            } finally {
                _refreshStatus.value = false
            }
        }
    }
}