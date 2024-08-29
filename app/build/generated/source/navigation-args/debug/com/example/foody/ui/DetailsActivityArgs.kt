package com.example.foody.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.foody.models.Result
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailsActivityArgs(
  val result: Result
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Result::class.java)) {
      result.putParcelable("result", this.result as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Result::class.java)) {
      result.putSerializable("result", this.result as Serializable)
    } else {
      throw UnsupportedOperationException(Result::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailsActivityArgs {
      bundle.setClassLoader(DetailsActivityArgs::class.java.classLoader)
      val __result : Result?
      if (bundle.containsKey("result")) {
        if (Parcelable::class.java.isAssignableFrom(Result::class.java) ||
            Serializable::class.java.isAssignableFrom(Result::class.java)) {
          __result = bundle.get("result") as Result?
        } else {
          throw UnsupportedOperationException(Result::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__result == null) {
          throw IllegalArgumentException("Argument \"result\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"result\" is missing and does not have an android:defaultValue")
      }
      return DetailsActivityArgs(__result)
    }
  }
}
