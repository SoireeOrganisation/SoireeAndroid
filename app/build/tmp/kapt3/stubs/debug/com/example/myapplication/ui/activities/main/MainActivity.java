package com.example.myapplication.ui.activities.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0019H\u0014J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010&\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010\'\u001a\u00020\u001eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006("}, d2 = {"Lcom/example/myapplication/ui/activities/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "_binding", "Lcom/example/myapplication/databinding/ActivityMainBinding;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "binding", "getBinding", "()Lcom/example/myapplication/databinding/ActivityMainBinding;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "toggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "viewModel", "Lcom/example/myapplication/ui/activities/main/MainViewModel;", "getViewModel", "()Lcom/example/myapplication/ui/activities/main/MainViewModel;", "viewModel$delegate", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "onOptionsMenuClosed", "onSupportNavigateUp", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    private final kotlin.Lazy navController$delegate = null;
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private androidx.appcompat.app.ActionBarDrawerToggle toggle;
    private com.example.myapplication.databinding.ActivityMainBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    private final com.example.myapplication.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    private final com.example.myapplication.ui.activities.main.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onOptionsMenuClosed(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}