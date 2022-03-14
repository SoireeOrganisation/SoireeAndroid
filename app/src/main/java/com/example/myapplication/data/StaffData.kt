package com.example.myapplication.data

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize


@Parcelize
data class StaffData(
    val company: CompanyData,
    val id: Int,
    val name: String,
    val patronymic: String,
    val surname: String
) : Parcelable