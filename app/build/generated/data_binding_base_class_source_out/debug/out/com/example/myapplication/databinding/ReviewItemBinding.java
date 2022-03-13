// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ReviewItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final MaterialTextView categoryAverageTextview;

  @NonNull
  public final MaterialTextView categoryNameTextview;

  private ReviewItemBinding(@NonNull CardView rootView,
      @NonNull MaterialTextView categoryAverageTextview,
      @NonNull MaterialTextView categoryNameTextview) {
    this.rootView = rootView;
    this.categoryAverageTextview = categoryAverageTextview;
    this.categoryNameTextview = categoryNameTextview;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ReviewItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ReviewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.review_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ReviewItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_average_textview;
      MaterialTextView categoryAverageTextview = ViewBindings.findChildViewById(rootView, id);
      if (categoryAverageTextview == null) {
        break missingId;
      }

      id = R.id.category_name_textview;
      MaterialTextView categoryNameTextview = ViewBindings.findChildViewById(rootView, id);
      if (categoryNameTextview == null) {
        break missingId;
      }

      return new ReviewItemBinding((CardView) rootView, categoryAverageTextview,
          categoryNameTextview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}