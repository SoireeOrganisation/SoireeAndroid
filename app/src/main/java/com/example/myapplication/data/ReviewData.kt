package com.example.myapplication.data

data class ReviewData(
    val category: Category,
    val company: CompanyData,
    val id: Int,
    val note: String,
    val reviewer: StaffData,
    val score: Int,
    val subject: StaffData
)