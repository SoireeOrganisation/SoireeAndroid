// Generated by data binding compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.myapplication.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentStaffBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView reviewRecyclerView;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  protected FragmentStaffBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView reviewRecyclerView, SwipeRefreshLayout swipeRefreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.reviewRecyclerView = reviewRecyclerView;
    this.swipeRefreshLayout = swipeRefreshLayout;
  }

  @NonNull
  public static FragmentStaffBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_staff, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStaffBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentStaffBinding>inflateInternal(inflater, R.layout.fragment_staff, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStaffBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_staff, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStaffBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentStaffBinding>inflateInternal(inflater, R.layout.fragment_staff, null, false, component);
  }

  public static FragmentStaffBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentStaffBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentStaffBinding)bind(component, view, R.layout.fragment_staff);
  }
}