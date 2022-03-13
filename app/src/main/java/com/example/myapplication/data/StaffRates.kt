package com.example.myapplication.data

import com.squareup.moshi.Json

data class StaffRates(
    val key: String,
    @field:Json(name = "reviews")
    val rates: List<Rate>,
    val subject_id: Int
)