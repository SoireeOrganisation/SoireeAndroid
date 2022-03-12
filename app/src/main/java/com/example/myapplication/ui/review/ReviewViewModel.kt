package com.example.myapplication.ui.review

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.Category
import com.example.myapplication.data.Rate
import com.example.myapplication.data.StaffData
import com.example.myapplication.data.StaffRates
import com.example.myapplication.network.Client
import com.example.myapplication.network.DEBUG_KEY
import kotlinx.coroutines.launch
import timber.log.Timber
import java.lang.Exception

class ReviewViewModel(val staffData: StaffData) : ViewModel() {
    private val _categoriesList: MutableLiveData<List<Category>> = MutableLiveData(mutableListOf())
    val categoriesList: LiveData<List<Category>>
        get() = _categoriesList



    fun getCategories() {
        viewModelScope.launch {
            Timber.d("getting categories...")
            try {
                _categoriesList.value = Client.retrofitService.getCategories()
            } catch (e: Exception) {
                Timber.d(e)
            }
        }
    }

    fun postMarks(rawRates: List<Int>) {
        require(categoriesList.value != null)
        viewModelScope.launch {
            Timber.d("posting marks...")
            try {
                val marksList = mutableListOf<Rate>()
                for (i in 0 until marksList.size) {
                    marksList.add(Rate(categoriesList.value!![i].id, "none", 2 * rawRates[i]))
                }
                val data = StaffRates(DEBUG_KEY, marksList, staffData.id)
            } catch(e : Exception) {
                Timber.d(e)
            }
        }
    }

}