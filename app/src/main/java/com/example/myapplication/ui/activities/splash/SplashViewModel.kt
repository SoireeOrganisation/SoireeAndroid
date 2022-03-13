package com.example.myapplication.ui.activities.splash

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Storage

class SplashViewModel : ViewModel() {

    fun isLogged(context : Context) : Boolean {
        val pref = context.getSharedPreferences(Storage.STORAGE_KEY, Context.MODE_PRIVATE)
        val s = pref.getString(Storage.VALUE_KEY, null)
        return !s.isNullOrEmpty()
    }

}