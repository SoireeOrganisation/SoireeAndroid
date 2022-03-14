package com.example.myapplication.adapters.staffAdapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/myapplication/adapters/staffAdapter/StaffRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication/adapters/staffAdapter/StaffRecyclerAdapter$ReviewViewHolder;", "Lcom/example/myapplication/adapters/DiffUtilData;", "Lcom/example/myapplication/data/StaffData;", "()V", "oldList", "", "getOldList", "()Ljava/util/List;", "setOldList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "ReviewViewHolder", "app_debug"})
public final class StaffRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myapplication.adapters.staffAdapter.StaffRecyclerAdapter.ReviewViewHolder> implements com.example.myapplication.adapters.DiffUtilData<com.example.myapplication.data.StaffData> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.myapplication.data.StaffData> oldList;
    
    public StaffRecyclerAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.myapplication.data.StaffData> getOldList() {
        return null;
    }
    
    @java.lang.Override()
    public void setOldList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.data.StaffData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myapplication.adapters.staffAdapter.StaffRecyclerAdapter.ReviewViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.adapters.staffAdapter.StaffRecyclerAdapter.ReviewViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.data.StaffData> list) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/myapplication/adapters/staffAdapter/StaffRecyclerAdapter$ReviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "name", "Lcom/google/android/material/textview/MaterialTextView;", "getName", "()Lcom/google/android/material/textview/MaterialTextView;", "surname", "getSurname", "getView", "()Landroid/view/View;", "app_debug"})
    public static final class ReviewViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.textview.MaterialTextView name = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.textview.MaterialTextView surname = null;
        
        public ReviewViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.textview.MaterialTextView getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.textview.MaterialTextView getSurname() {
            return null;
        }
    }
}