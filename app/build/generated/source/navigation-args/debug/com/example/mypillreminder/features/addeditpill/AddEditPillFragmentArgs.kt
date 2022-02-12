package com.example.mypillreminder.features.addeditpill

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddEditPillFragmentArgs(
  public val pillIdentifier: String?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("pillIdentifier", this.pillIdentifier)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddEditPillFragmentArgs {
      bundle.setClassLoader(AddEditPillFragmentArgs::class.java.classLoader)
      val __pillIdentifier : String?
      if (bundle.containsKey("pillIdentifier")) {
        __pillIdentifier = bundle.getString("pillIdentifier")
      } else {
        throw IllegalArgumentException("Required argument \"pillIdentifier\" is missing and does not have an android:defaultValue")
      }
      return AddEditPillFragmentArgs(__pillIdentifier)
    }
  }
}
