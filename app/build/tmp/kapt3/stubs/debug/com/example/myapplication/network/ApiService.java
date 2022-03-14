package com.example.myapplication.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myapplication/network/ApiService;", "", "getBonuses", "", "Lcom/example/myapplication/data/RewardsData;", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/example/myapplication/data/Category;", "getReviews", "Lcom/example/myapplication/data/ReviewData;", "getStaff", "Lcom/example/myapplication/data/StaffData;", "postMarks", "Lretrofit2/Response;", "data", "Lcom/example/myapplication/data/StaffRates;", "(Lcom/example/myapplication/data/StaffRates;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLogin", "Lcom/example/myapplication/data/LoginResponseData;", "requestData", "Lcom/example/myapplication/data/LoginRequestData;", "(Lcom/example/myapplication/data/LoginRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/api/staff")
    public abstract java.lang.Object getStaff(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.data.StaffData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/bonuses")
    public abstract java.lang.Object getBonuses(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.data.RewardsData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/reviews")
    public abstract java.lang.Object getReviews(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.data.ReviewData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/reviews/categories")
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.data.Category>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/reviews")
    public abstract java.lang.Object postMarks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myapplication.data.StaffRates data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/login")
    public abstract java.lang.Object tryLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.myapplication.data.LoginRequestData requestData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.myapplication.data.LoginResponseData> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}