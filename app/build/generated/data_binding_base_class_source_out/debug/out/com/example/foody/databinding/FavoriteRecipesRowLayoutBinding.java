// Generated by data binding compiler. Do not edit!
package com.example.foody.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.foody.R;
import com.example.foody.data.database.entities.FavoritesEntity;
import com.google.android.material.card.MaterialCardView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FavoriteRecipesRowLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView favoriteClockImageView;

  @NonNull
  public final TextView favoriteClockTextView;

  @NonNull
  public final TextView favoriteDescriptionTextView;

  @NonNull
  public final ImageView favoriteHeartImageView;

  @NonNull
  public final TextView favoriteHeartTextView;

  @NonNull
  public final ImageView favoriteLeafImageView;

  @NonNull
  public final TextView favoriteLeafTextView;

  @NonNull
  public final ImageView favoriteRecipeImageView;

  @NonNull
  public final ConstraintLayout favoriteRecipesRowLayout;

  @NonNull
  public final MaterialCardView favoriteRowCardView;

  @NonNull
  public final TextView favoriteTitleTextView;

  @Bindable
  protected FavoritesEntity mFavoritesEntity;

  protected FavoriteRecipesRowLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView favoriteClockImageView, TextView favoriteClockTextView,
      TextView favoriteDescriptionTextView, ImageView favoriteHeartImageView,
      TextView favoriteHeartTextView, ImageView favoriteLeafImageView,
      TextView favoriteLeafTextView, ImageView favoriteRecipeImageView,
      ConstraintLayout favoriteRecipesRowLayout, MaterialCardView favoriteRowCardView,
      TextView favoriteTitleTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.favoriteClockImageView = favoriteClockImageView;
    this.favoriteClockTextView = favoriteClockTextView;
    this.favoriteDescriptionTextView = favoriteDescriptionTextView;
    this.favoriteHeartImageView = favoriteHeartImageView;
    this.favoriteHeartTextView = favoriteHeartTextView;
    this.favoriteLeafImageView = favoriteLeafImageView;
    this.favoriteLeafTextView = favoriteLeafTextView;
    this.favoriteRecipeImageView = favoriteRecipeImageView;
    this.favoriteRecipesRowLayout = favoriteRecipesRowLayout;
    this.favoriteRowCardView = favoriteRowCardView;
    this.favoriteTitleTextView = favoriteTitleTextView;
  }

  public abstract void setFavoritesEntity(@Nullable FavoritesEntity favoritesEntity);

  @Nullable
  public FavoritesEntity getFavoritesEntity() {
    return mFavoritesEntity;
  }

  @NonNull
  public static FavoriteRecipesRowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.favorite_recipes_row_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FavoriteRecipesRowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FavoriteRecipesRowLayoutBinding>inflateInternal(inflater, R.layout.favorite_recipes_row_layout, root, attachToRoot, component);
  }

  @NonNull
  public static FavoriteRecipesRowLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.favorite_recipes_row_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FavoriteRecipesRowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FavoriteRecipesRowLayoutBinding>inflateInternal(inflater, R.layout.favorite_recipes_row_layout, null, false, component);
  }

  public static FavoriteRecipesRowLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FavoriteRecipesRowLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FavoriteRecipesRowLayoutBinding)bind(component, view, R.layout.favorite_recipes_row_layout);
  }
}
