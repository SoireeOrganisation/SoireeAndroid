package com.example.myapplication.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/myapplication/adapters/RewardsRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication/adapters/RewardsRecyclerAdapter$RewardsViewHolder;", "context", "Landroid/content/Context;", "listOfRewards", "", "Lcom/example/myapplication/data/RewardsData;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RewardsViewHolder", "app_debug"})
public final class RewardsRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myapplication.adapters.RewardsRecyclerAdapter.RewardsViewHolder> {
    private final android.content.Context context = null;
    private final java.util.List<com.example.myapplication.data.RewardsData> listOfRewards = null;
    
    public RewardsRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.data.RewardsData> listOfRewards) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myapplication.adapters.RewardsRecyclerAdapter.RewardsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.adapters.RewardsRecyclerAdapter.RewardsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myapplication/adapters/RewardsRecyclerAdapter$RewardsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "cardView", "Lcom/google/android/material/card/MaterialCardView;", "kotlin.jvm.PlatformType", "getCardView", "()Lcom/google/android/material/card/MaterialCardView;", "nameTextView", "Lcom/google/android/material/textview/MaterialTextView;", "getNameTextView", "()Lcom/google/android/material/textview/MaterialTextView;", "priceTextView", "getPriceTextView", "app_debug"})
    public static final class RewardsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.google.android.material.textview.MaterialTextView nameTextView = null;
        private final com.google.android.material.textview.MaterialTextView priceTextView = null;
        private final com.google.android.material.card.MaterialCardView cardView = null;
        
        public RewardsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final com.google.android.material.textview.MaterialTextView getNameTextView() {
            return null;
        }
        
        public final com.google.android.material.textview.MaterialTextView getPriceTextView() {
            return null;
        }
        
        public final com.google.android.material.card.MaterialCardView getCardView() {
            return null;
        }
    }
}