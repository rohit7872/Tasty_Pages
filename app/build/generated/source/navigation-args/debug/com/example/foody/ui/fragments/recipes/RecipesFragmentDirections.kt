package com.example.foody.ui.fragments.recipes

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foody.R

class RecipesFragmentDirections private constructor() {
  companion object {
    fun actionRecipesFragmentToRecipesBottomSheet(): NavDirections =
        ActionOnlyNavDirections(R.id.action_recipesFragment_to_recipesBottomSheet)
  }
}
