package com.example.myapplication.network

import com.example.myapplication.data.*
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import java.security.MessageDigest

const val BASE_URL = "http://20.113.130.40"
var DEBUG_KEY = ""
    private set
const val DEBUG_KEY_REVIEW = "9b9998f9c8abc6961a0bdb834471fe4a"
val retrofit: Retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(
        BASE_URL
    ).build()

interface ApiService {
    @GET("/api/staff")
    suspend fun getStaff(@Query("key") key: String = DEBUG_KEY): List<StaffData>

    @GET("api/bonuses")
    suspend fun getBonuses(@Query("key") key: String = DEBUG_KEY): List<RewardsData>

    @GET("api/reviews")
    suspend fun getReviews(@Query("key") key: String = DEBUG_KEY): List<ReviewData> // was review

    @GET("api/reviews/categories")
    suspend fun getCategories(@Query("key") key: String = DEBUG_KEY): List<Category> // was review

    @POST("api/reviews")
    suspend fun postMarks(@Body data: StaffRates): Response<String>

    @POST("api/login")
    suspend fun tryLogin(@Body requestData: LoginRequestData) : LoginResponseData
}


object Client {
    fun setKey(preview: String) {
        if (DEBUG_KEY.isNotEmpty())
            return
        DEBUG_KEY = preview
    }

    private fun ByteArray.toHex() = joinToString(separator = "") { byte -> "%02x".format(byte) }

    private fun md5(str: String): ByteArray =
        MessageDigest.getInstance("MD5").digest(str.toByteArray(Charsets.UTF_8))

    fun getHash(preview: String): String = md5(preview).toHex()

    val retrofitService: ApiService by lazy {

        retrofit.create(ApiService::class.java)
    }
}