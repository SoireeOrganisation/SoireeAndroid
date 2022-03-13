package com.example.myapplication.ui.activities.main

import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.Storage
import com.example.myapplication.network.Client

class MainViewModel : ViewModel() {


    fun initClient(context: Context) {
        val pref = context.getSharedPreferences(Storage.STORAGE_KEY, Context.MODE_PRIVATE)
        val key = pref.getString(Storage.VALUE_KEY, null)
        Client.setKey(key ?: "")
    }

    fun restoreClient(context: Context) {
        val pref = context.getSharedPreferences(Storage.STORAGE_KEY, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString(Storage.VALUE_KEY, null)
        editor.apply()
    }
}