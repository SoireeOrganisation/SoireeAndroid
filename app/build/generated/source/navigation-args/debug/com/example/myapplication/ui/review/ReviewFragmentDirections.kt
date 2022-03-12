package com.example.myapplication.ui.review

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.myapplication.R

public class ReviewFragmentDirections private constructor() {
  public companion object {
    public fun actionRateFragmentToStaffFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_rateFragment_to_staffFragment)
  }
}
