package com.example.foody.bindingadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/foody/bindingadapters/FavoriteRecipesBinding;", "", "()V", "Companion", "app_debug"})
public final class FavoriteRecipesBinding {
    public static final com.example.foody.bindingadapters.FavoriteRecipesBinding.Companion Companion = null;
    
    public FavoriteRecipesBinding() {
        super();
    }
    
    @androidx.databinding.BindingAdapter(value = {"viewVisibility", "setData"}, requireAll = false)
    public static final void setDataAndViewVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.foody.data.database.entities.FavoritesEntity> favoritesEntity, @org.jetbrains.annotations.Nullable()
    com.example.foody.adapters.FavoriteRecipesAdapter mAdapter) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/foody/bindingadapters/FavoriteRecipesBinding$Companion;", "", "()V", "setDataAndViewVisibility", "", "view", "Landroid/view/View;", "favoritesEntity", "", "Lcom/example/foody/data/database/entities/FavoritesEntity;", "mAdapter", "Lcom/example/foody/adapters/FavoriteRecipesAdapter;", "app_debug"})
    public static final class Companion {
        
        @androidx.databinding.BindingAdapter(value = {"viewVisibility", "setData"}, requireAll = false)
        public final void setDataAndViewVisibility(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        java.util.List<com.example.foody.data.database.entities.FavoritesEntity> favoritesEntity, @org.jetbrains.annotations.Nullable()
        com.example.foody.adapters.FavoriteRecipesAdapter mAdapter) {
        }
        
        private Companion() {
            super();
        }
    }
}