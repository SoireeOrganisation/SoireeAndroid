package com.example.myapplication.ui.review

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.myapplication.R
import kotlin.Int

public class ReviewFragmentDirections private constructor() {
  private data class ActionRateFragmentToStaffFragment(
    public val removeId: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_rateFragment_to_staffFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("removeId", this.removeId)
        return result
      }
  }

  public companion object {
    public fun actionRateFragmentToStaffFragment(removeId: Int = -1): NavDirections =
        ActionRateFragmentToStaffFragment(removeId)
  }
}
