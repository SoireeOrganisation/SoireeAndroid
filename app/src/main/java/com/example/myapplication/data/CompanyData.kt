package com.example.myapplication.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CompanyData(val id : Int, val name : String) : Parcelable
