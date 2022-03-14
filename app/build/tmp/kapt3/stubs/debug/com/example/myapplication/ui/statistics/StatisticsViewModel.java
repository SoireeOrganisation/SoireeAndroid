package com.example.myapplication.ui.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/example/myapplication/ui/statistics/StatisticsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_responseStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/myapplication/network/DataResponseState;", "_reviewList", "", "Lcom/example/myapplication/data/ProcessedReviewData;", "<set-?>", "", "firstDownload", "getFirstDownload", "()Z", "responseStatus", "Landroidx/lifecycle/LiveData;", "getResponseStatus", "()Landroidx/lifecycle/LiveData;", "reviewList", "getReviewList", "convertToProcessedReviewData", "list", "Lcom/example/myapplication/data/ReviewData;", "getReviews", "", "app_debug"})
public final class StatisticsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myapplication.data.ProcessedReviewData>> _reviewList = null;
    private final androidx.lifecycle.MutableLiveData<com.example.myapplication.network.DataResponseState> _responseStatus = null;
    private boolean firstDownload = true;
    
    public StatisticsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.ProcessedReviewData>> getReviewList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.myapplication.network.DataResponseState> getResponseStatus() {
        return null;
    }
    
    public final boolean getFirstDownload() {
        return false;
    }
    
    private final java.util.List<com.example.myapplication.data.ProcessedReviewData> convertToProcessedReviewData(java.util.List<com.example.myapplication.data.ReviewData> list) {
        return null;
    }
    
    public final void getReviews() {
    }
}