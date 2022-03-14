package com.example.myapplication.adapters.userAdapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u001aB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0016\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/myapplication/adapters/userAdapter/UserReviewRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication/adapters/userAdapter/UserReviewRecyclerAdapter$ViewHolder;", "Lcom/example/myapplication/adapters/DiffUtilData;", "Lcom/example/myapplication/data/ProcessedReviewData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "oldList", "", "getOldList", "()Ljava/util/List;", "setOldList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ViewHolder", "app_debug"})
public final class UserReviewRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myapplication.adapters.userAdapter.UserReviewRecyclerAdapter.ViewHolder> implements com.example.myapplication.adapters.DiffUtilData<com.example.myapplication.data.ProcessedReviewData> {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.myapplication.data.ProcessedReviewData> oldList;
    
    public UserReviewRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.myapplication.data.ProcessedReviewData> getOldList() {
        return null;
    }
    
    @java.lang.Override()
    public void setOldList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.data.ProcessedReviewData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myapplication.adapters.userAdapter.UserReviewRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.adapters.userAdapter.UserReviewRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.data.ProcessedReviewData> list) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/myapplication/adapters/userAdapter/UserReviewRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "nameTextView", "Lcom/google/android/material/textview/MaterialTextView;", "getNameTextView", "()Lcom/google/android/material/textview/MaterialTextView;", "scoreTextView", "getScoreTextView", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.textview.MaterialTextView nameTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.textview.MaterialTextView scoreTextView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.textview.MaterialTextView getNameTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.textview.MaterialTextView getScoreTextView() {
            return null;
        }
    }
}