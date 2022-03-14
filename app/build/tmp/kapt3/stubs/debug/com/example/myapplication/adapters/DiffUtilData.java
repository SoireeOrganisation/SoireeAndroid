package com.example.myapplication.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/myapplication/adapters/DiffUtilData;", "T", "", "oldList", "", "getOldList", "()Ljava/util/List;", "setOldList", "(Ljava/util/List;)V", "setData", "", "list", "app_debug"})
public abstract interface DiffUtilData<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<T> getOldList();
    
    public abstract void setOldList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> p0);
    
    public abstract void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> list);
}