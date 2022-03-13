package com.example.myapplication.network

import com.example.myapplication.data.*
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

const val BASE_URL = "http://PaperFoldingSkill.pythonanywhere.com"
const val DEBUG_KEY = "40c43c2fec798fa2216be854101756ae"
const val DEBUG_KEY_REVIEW = "9b9998f9c8abc6961a0bdb834471fe4a"
val retrofit: Retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(
        BASE_URL
    ).build()

interface ApiService {
    @GET("/api/staff")
    suspend fun getStaff(@Query("key") key: String = DEBUG_KEY): List<StaffData>

    @GET("api/bonuses")
    suspend fun getBonuses(@Query("key") key: String = DEBUG_KEY): List<BonusData>

    @GET("api/reviews")
    suspend fun getReviews(@Query("key") key: String = DEBUG_KEY_REVIEW): List<ReviewData>

    @GET("api/reviews/categories")
    suspend fun getCategories(@Query("key") key: String = DEBUG_KEY_REVIEW): List<Category>

    @POST("api/reviews")
    suspend fun postMarks(@Body data : StaffRates) : Response<String>
}


object Client {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}