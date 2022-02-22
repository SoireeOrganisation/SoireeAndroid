package com.example.myapplication.data

import com.squareup.moshi.Json

data class StaffData(
    @Json(name = "company") val companyName: CompanyData,
    val id: Int,
    val name: String,
    val patronymic: String,
    val surname: String
)