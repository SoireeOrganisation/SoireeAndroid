package com.example.myapplication.ui.activities.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.LoginData
import com.example.myapplication.network.Client
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception

class LoginViewModel : ViewModel() {


    fun sendQuery(s: String) {
        viewModelScope.launch {
            try {
                val hash = Client.getHash(s)
                Client.retrofitService.tryLogin(LoginData(hash))
            } catch (e: Exception) {
                Timber.d(e)
            }
        }
    }
}