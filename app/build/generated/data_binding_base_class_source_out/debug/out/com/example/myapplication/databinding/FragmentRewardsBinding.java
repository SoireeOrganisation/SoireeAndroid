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

public abstract class FragmentRewardsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerviewRewards;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  protected FragmentRewardsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerviewRewards, SwipeRefreshLayout swipeRefreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerviewRewards = recyclerviewRewards;
    this.swipeRefreshLayout = swipeRefreshLayout;
  }

  @NonNull
  public static FragmentRewardsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_rewards, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRewardsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRewardsBinding>inflateInternal(inflater, R.layout.fragment_rewards, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRewardsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_rewards, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRewardsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRewardsBinding>inflateInternal(inflater, R.layout.fragment_rewards, null, false, component);
  }

  public static FragmentRewardsBinding bind(@NonNull View view) {
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
  public static FragmentRewardsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRewardsBinding)bind(component, view, R.layout.fragment_rewards);
  }
}