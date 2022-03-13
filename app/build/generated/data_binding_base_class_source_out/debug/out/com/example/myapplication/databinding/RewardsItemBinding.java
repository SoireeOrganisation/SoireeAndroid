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

public final class RewardsItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialTextView nameTextview;

  @NonNull
  public final MaterialCardView rewardsCardview;

  private RewardsItemBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialTextView nameTextview, @NonNull MaterialCardView rewardsCardview) {
    this.rootView = rootView;
    this.nameTextview = nameTextview;
    this.rewardsCardview = rewardsCardview;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RewardsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RewardsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rewards_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RewardsItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.name_textview;
      MaterialTextView nameTextview = ViewBindings.findChildViewById(rootView, id);
      if (nameTextview == null) {
        break missingId;
      }

      MaterialCardView rewardsCardview = (MaterialCardView) rootView;

      return new RewardsItemBinding((MaterialCardView) rootView, nameTextview, rewardsCardview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
