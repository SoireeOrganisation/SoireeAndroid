package com.example.myapplication.ui.rewards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myapplication/ui/rewards/RewardsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_bonusesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/myapplication/data/RewardsData;", "_responseStatus", "Lcom/example/myapplication/network/DataResponseState;", "bonusesList", "Landroidx/lifecycle/LiveData;", "getBonusesList", "()Landroidx/lifecycle/LiveData;", "<set-?>", "", "firstDownload", "getFirstDownload", "()Z", "responseStatus", "getResponseStatus", "getBonuses", "", "app_debug"})
public final class RewardsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myapplication.data.RewardsData>> _bonusesList = null;
    private final androidx.lifecycle.MutableLiveData<com.example.myapplication.network.DataResponseState> _responseStatus = null;
    private boolean firstDownload = true;
    
    public RewardsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.data.RewardsData>> getBonusesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.myapplication.network.DataResponseState> getResponseStatus() {
        return null;
    }
    
    public final boolean getFirstDownload() {
        return false;
    }
    
    public final void getBonuses() {
    }
}