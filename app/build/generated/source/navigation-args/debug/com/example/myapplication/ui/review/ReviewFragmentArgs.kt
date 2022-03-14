package com.example.myapplication.ui.review

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.myapplication.`data`.StaffData
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ReviewFragmentArgs(
  public val workerData: StaffData
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(StaffData::class.java)) {
      result.set("workerData", this.workerData as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(StaffData::class.java)) {
      result.set("workerData", this.workerData as Serializable)
    } else {
      throw UnsupportedOperationException(StaffData::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ReviewFragmentArgs {
      bundle.setClassLoader(ReviewFragmentArgs::class.java.classLoader)
      val __workerData : StaffData?
      if (bundle.containsKey("workerData")) {
        if (Parcelable::class.java.isAssignableFrom(StaffData::class.java) ||
            Serializable::class.java.isAssignableFrom(StaffData::class.java)) {
          __workerData = bundle.get("workerData") as StaffData?
        } else {
          throw UnsupportedOperationException(StaffData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__workerData == null) {
          throw IllegalArgumentException("Argument \"workerData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"workerData\" is missing and does not have an android:defaultValue")
      }
      return ReviewFragmentArgs(__workerData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ReviewFragmentArgs {
      val __workerData : StaffData?
      if (savedStateHandle.contains("workerData")) {
        if (Parcelable::class.java.isAssignableFrom(StaffData::class.java) ||
            Serializable::class.java.isAssignableFrom(StaffData::class.java)) {
          __workerData = savedStateHandle.get<StaffData?>("workerData")
        } else {
          throw UnsupportedOperationException(StaffData::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__workerData == null) {
          throw IllegalArgumentException("Argument \"workerData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"workerData\" is missing and does not have an android:defaultValue")
      }
      return ReviewFragmentArgs(__workerData)
    }
  }
}
