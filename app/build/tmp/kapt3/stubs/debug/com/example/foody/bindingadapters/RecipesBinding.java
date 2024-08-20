package com.example.foody.bindingadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/foody/bindingadapters/RecipesBinding;", "", "()V", "Companion", "app_debug"})
public final class RecipesBinding {
    public static final com.example.foody.bindingadapters.RecipesBinding.Companion Companion = null;
    
    public RecipesBinding() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"readApiResponse", "readDatabase"}, requireAll = true)
    public static final void errorImageViewVisibility(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe> apiResponse, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.foody.data.database.RecipesEntity> database) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"readApiResponse2", "readDatabase2"}, requireAll = true)
    public static final void errorTextViewVisibility(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe> apiResponse, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.foody.data.database.RecipesEntity> database) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/foody/bindingadapters/RecipesBinding$Companion;", "", "()V", "errorImageViewVisibility", "", "imageView", "Landroid/widget/ImageView;", "apiResponse", "Lcom/example/foody/util/NetworkResult;", "Lcom/example/foody/models/FoodRecipe;", "database", "", "Lcom/example/foody/data/database/RecipesEntity;", "errorTextViewVisibility", "textView", "Landroid/widget/TextView;", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"readApiResponse", "readDatabase"}, requireAll = true)
        public final void errorImageViewVisibility(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
        com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe> apiResponse, @org.jetbrains.annotations.Nullable()
        java.util.List<com.example.foody.data.database.RecipesEntity> database) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"readApiResponse2", "readDatabase2"}, requireAll = true)
        public final void errorTextViewVisibility(@org.jetbrains.annotations.NotNull()
        android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
        com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe> apiResponse, @org.jetbrains.annotations.Nullable()
        java.util.List<com.example.foody.data.database.RecipesEntity> database) {
        }
        
        private Companion() {
            super();
        }
    }
}