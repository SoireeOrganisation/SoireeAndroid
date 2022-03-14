package com.example.myapplication.ui.staff

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.myapplication.R
import com.example.myapplication.`data`.StaffData
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class StaffFragmentDirections private constructor() {
  private data class ActionReviewFragmentToRateFragment(
    public val workerData: StaffData
  ) : NavDirections {
    public override val actionId: Int = R.id.action_reviewFragment_to_rateFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(StaffData::class.java)) {
          result.putParcelable("workerData", this.workerData as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(StaffData::class.java)) {
          result.putSerializable("workerData", this.workerData as Serializable)
        } else {
          throw UnsupportedOperationException(StaffData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionReviewFragmentToRateFragment(workerData: StaffData): NavDirections =
        ActionReviewFragmentToRateFragment(workerData)
  }
}
