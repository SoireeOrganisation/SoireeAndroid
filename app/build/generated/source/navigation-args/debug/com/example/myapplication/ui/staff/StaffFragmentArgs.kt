package com.example.myapplication.ui.staff

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class StaffFragmentArgs(
  public val removeId: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("removeId", this.removeId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("removeId", this.removeId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): StaffFragmentArgs {
      bundle.setClassLoader(StaffFragmentArgs::class.java.classLoader)
      val __removeId : Int
      if (bundle.containsKey("removeId")) {
        __removeId = bundle.getInt("removeId")
      } else {
        __removeId = -1
      }
      return StaffFragmentArgs(__removeId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): StaffFragmentArgs {
      val __removeId : Int?
      if (savedStateHandle.contains("removeId")) {
        __removeId = savedStateHandle["removeId"]
        if (__removeId == null) {
          throw IllegalArgumentException("Argument \"removeId\" of type integer does not support null values")
        }
      } else {
        __removeId = -1
      }
      return StaffFragmentArgs(__removeId)
    }
  }
}
