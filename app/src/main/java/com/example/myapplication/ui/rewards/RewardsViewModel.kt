package com.example.myapplication.ui.rewards

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.RewardsData
import com.example.myapplication.network.Client
import com.example.myapplication.network.DataResponseState
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception


class RewardsViewModel : ViewModel() {
    private val _bonusesList: MutableLiveData<List<RewardsData>> = MutableLiveData(mutableListOf())
    val bonusesList: LiveData<List<RewardsData>>
        get() = _bonusesList
    private val _responseStatus: MutableLiveData<DataResponseState> =
        MutableLiveData(DataResponseState.NONE)
    val responseStatus: LiveData<DataResponseState>
        get() = _responseStatus

    var firstDownload = true
        private set

    fun getBonuses() {
        firstDownload = false
        viewModelScope.launch {
            _responseStatus.value = DataResponseState.LOADING
            try {
                _bonusesList.value = Client.retrofitService.getBonuses()
                Timber.d("${_bonusesList.value?.size ?: -1}")
                if (_bonusesList.value?.size ?: 0 == 0)
                    _responseStatus.value = DataResponseState.EMPTY
                else
                    _responseStatus.value = DataResponseState.FULL
            } catch (e: Exception) {
                Timber.d(e)
                DataResponseState.ERROR
            }
        }
    }
}