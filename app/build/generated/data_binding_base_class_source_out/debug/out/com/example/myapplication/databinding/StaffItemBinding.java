// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StaffItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialTextView nameTextview;

  @NonNull
  public final MaterialTextView patronymicTextview;

  @NonNull
  public final MaterialCardView reviewCardview;

  @NonNull
  public final MaterialTextView surnameTextview;

  private StaffItemBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialTextView nameTextview, @NonNull MaterialTextView patronymicTextview,
      @NonNull MaterialCardView reviewCardview, @NonNull MaterialTextView surnameTextview) {
    this.rootView = rootView;
    this.nameTextview = nameTextview;
    this.patronymicTextview = patronymicTextview;
    this.reviewCardview = reviewCardview;
    this.surnameTextview = surnameTextview;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static StaffItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StaffItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.staff_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StaffItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.name_textview;
      MaterialTextView nameTextview = ViewBindings.findChildViewById(rootView, id);
      if (nameTextview == null) {
        break missingId;
      }

      id = R.id.patronymic_textview;
      MaterialTextView patronymicTextview = ViewBindings.findChildViewById(rootView, id);
      if (patronymicTextview == null) {
        break missingId;
      }

      MaterialCardView reviewCardview = (MaterialCardView) rootView;

      id = R.id.surname_textview;
      MaterialTextView surnameTextview = ViewBindings.findChildViewById(rootView, id);
      if (surnameTextview == null) {
        break missingId;
      }

      return new StaffItemBinding((MaterialCardView) rootView, nameTextview, patronymicTextview,
          reviewCardview, surnameTextview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}