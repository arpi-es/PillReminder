package com.example.mypillreminder.features.addeditpill

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.mypillreminder.R

public class AddEditPillFragmentDirections private constructor() {
  public companion object {
    public fun actionAddEditPillFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addEditPillFragment_to_homeFragment)
  }
}
