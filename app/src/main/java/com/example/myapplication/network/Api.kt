package com.example.myapplication.network

import com.example.myapplication.data.StaffList
import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "http://PaperFoldingSkill.pythonanywhere.com"
const val DEBUG_KEY = "40c43c2fec798fa2216be854101756ae"
val retrofit: Retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(
        BASE_URL
    ).build()

interface ApiService {
    @GET("/api/staff")
    suspend fun getStaff(@Query("key") key: String = DEBUG_KEY): StaffList
}


object Client {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}