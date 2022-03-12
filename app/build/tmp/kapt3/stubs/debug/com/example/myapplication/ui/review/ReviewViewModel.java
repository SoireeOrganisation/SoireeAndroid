package com.example.myapplication.ui.review;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/myapplication/ui/review/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "staffData", "Lcom/example/myapplication/data/StaffData;", "(Lcom/example/myapplication/data/StaffData;)V", "_categoriesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/myapplication/data/Category;", "categoriesList", "Landroidx/lifecycle/LiveData;", "getCategoriesList", "()Landroidx/lifecycle/LiveData;", "getStaffData", "()Lcom/example/myapplication/data/StaffData;", "getCategories", "", "postMarks", "rawRates", "", "app_debug"})
public final class ReviewViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.data.StaffData staffData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myapplication.data.Category>> _categoriesList = null;
    
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
    
    public final void getCategories() {
    }
    
    public final void postMarks(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> rawRates) {
    }
}