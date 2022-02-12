package com.example.mypillreminder.features.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.mypillreminder.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToAddEditPillFragment(
    public val pillIdentifier: String?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_addEditPillFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("pillIdentifier", this.pillIdentifier)
      return result
    }
  }

  public companion object {
    public fun actionHomeFragmentToAddEditPillFragment(pillIdentifier: String?): NavDirections =
        ActionHomeFragmentToAddEditPillFragment(pillIdentifier)
  }
}
