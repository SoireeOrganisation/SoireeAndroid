package com.example.myapplication.ui.activities.login

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.LoginRequestData
import com.example.myapplication.data.Storage
import com.example.myapplication.network.Client
import com.example.myapplication.network.ResponseState
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception

class LoginViewModel : ViewModel() {

    private val _responseState: MutableLiveData<ResponseState> = MutableLiveData(ResponseState.NONE)
    val responseState: LiveData<ResponseState>
        get() = _responseState


    fun sendQuery(s: String) {
        _responseState.value = ResponseState.LOADING
        viewModelScope.launch {
            try {
                val hash = Client.getHash(s)
                val response = Client.retrofitService.tryLogin(LoginRequestData(hash))
                Timber.d("state: ${response.status}")
                _responseState.value =
                    if (response.status == "ok") ResponseState.SUCCESSFUL else ResponseState.FAILED
            } catch (e: Exception) {
                _responseState.value = ResponseState.ERROR
                Timber.d(e)
            }
        }
    }

    fun setSharedPreferences(context : Context, hashed : String){
        val pref = context.getSharedPreferences(Storage.STORAGE_KEY, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(Storage.VALUE_KEY, Client.getHash(hashed))
        editor.apply()
        Timber.d("result of Hash: ${pref.getString(Storage.VALUE_KEY, "nope")}")
        Timber.d("api key: ")
    }
}