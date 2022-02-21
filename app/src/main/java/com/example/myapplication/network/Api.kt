package com.example.myapplication.network

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val BASE_URL = "yandex.ru"

val retrofit: Retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(
        BASE_URL
    ).build()

interface ApiService {

}


object Client {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}