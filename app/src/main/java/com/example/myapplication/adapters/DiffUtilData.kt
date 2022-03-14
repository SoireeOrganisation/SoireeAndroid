package com.example.myapplication.adapters

interface DiffUtilData<T> {

    var oldList: List<T>
    fun setData(list : List<T>)
}