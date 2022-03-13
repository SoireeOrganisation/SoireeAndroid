package com.example.myapplication.ui.review;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lcom/example/myapplication/ui/review/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "staffData", "Lcom/example/myapplication/data/StaffData;", "(Lcom/example/myapplication/data/StaffData;)V", "_categoriesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/myapplication/data/Category;", "categoriesList", "Landroidx/lifecycle/LiveData;", "getCategoriesList", "()Landroidx/lifecycle/LiveData;", "value", "Lcom/example/myapplication/ui/review/ResponseState;", "responseState", "getResponseState", "()Landroidx/lifecycle/MutableLiveData;", "setResponseState", "(Landroidx/lifecycle/MutableLiveData;)V", "getStaffData", "()Lcom/example/myapplication/data/StaffData;", "getCategories", "", "postMarks", "rawRates", "", "app_debug"})
public final class ReviewViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.data.StaffData staffData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myapplication.data.Category>> _categoriesList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.myapplication.ui.review.ResponseState> responseState;
    
    public ReviewViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.StaffData staffData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.data.StaffData getStaffData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.Category>> getCategoriesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.myapplication.ui.review.ResponseState> getResponseState() {
        return null;
    }
    
    private final void setResponseState(androidx.lifecycle.MutableLiveData<com.example.myapplication.ui.review.ResponseState> value) {
    }
    
    public final void getCategories() {
    }
    
    public final void postMarks(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> rawRates) {
    }
}