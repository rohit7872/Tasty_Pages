package com.example.foody.bindingadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/foody/bindingadapters/FoodJokeBinding;", "", "()V", "Companion", "app_debug"})
public final class FoodJokeBinding {
    public static final com.example.foody.bindingadapters.FoodJokeBinding.Companion Companion = null;
    
    public FoodJokeBinding() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"readApiResponse3", "readDatabase3"}, requireAll = false)
    public static final void setCardAndProgressVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke> apiResponse, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.foody.data.database.entities.FoodJokeEntity> database) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"readApiResponse4", "readDatabase4"}, requireAll = true)
    public static final void setErrorViewsVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke> apiResponse, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.foody.data.database.entities.FoodJokeEntity> database) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/foody/bindingadapters/FoodJokeBinding$Companion;", "", "()V", "setCardAndProgressVisibility", "", "view", "Landroid/view/View;", "apiResponse", "Lcom/example/foody/util/NetworkResult;", "Lcom/example/foody/models/FoodJoke;", "database", "", "Lcom/example/foody/data/database/entities/FoodJokeEntity;", "setErrorViewsVisibility", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"readApiResponse3", "readDatabase3"}, requireAll = false)
        public final void setCardAndProgressVisibility(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke> apiResponse, @org.jetbrains.annotations.Nullable()
        java.util.List<com.example.foody.data.database.entities.FoodJokeEntity> database) {
        }
        
        @androidx.databinding.BindingAdapter(value = {"readApiResponse4", "readDatabase4"}, requireAll = true)
        public final void setErrorViewsVisibility(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke> apiResponse, @org.jetbrains.annotations.Nullable()
        java.util.List<com.example.foody.data.database.entities.FoodJokeEntity> database) {
        }
        
        private Companion() {
            super();
        }
    }
}