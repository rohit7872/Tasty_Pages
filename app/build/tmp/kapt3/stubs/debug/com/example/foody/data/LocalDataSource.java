package com.example.foody.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u0016J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00170\u0016J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00170\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/foody/data/LocalDataSource;", "", "recipesDao", "Lcom/example/foody/data/database/RecipesDao;", "(Lcom/example/foody/data/database/RecipesDao;)V", "deleteAllFavoriteRecipes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavoriteRecipe", "favoritesEntity", "Lcom/example/foody/data/database/entities/FavoritesEntity;", "(Lcom/example/foody/data/database/entities/FavoritesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFavoriteRecipes", "insertFoodJoke", "foodJokeEntity", "Lcom/example/foody/data/database/entities/FoodJokeEntity;", "(Lcom/example/foody/data/database/entities/FoodJokeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecipes", "recipesEntity", "Lcom/example/foody/data/database/entities/RecipesEntity;", "(Lcom/example/foody/data/database/entities/RecipesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFavoriteRecipes", "Lkotlinx/coroutines/flow/Flow;", "", "readFoodJoke", "readRecipes", "app_debug"})
public final class LocalDataSource {
    private final com.example.foody.data.database.RecipesDao recipesDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.foody.data.database.entities.RecipesEntity>> readRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.foody.data.database.entities.FavoritesEntity>> readFavoriteRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.foody.data.database.entities.FoodJokeEntity>> readFoodJoke() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertRecipes(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.entities.RecipesEntity recipesEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFavoriteRecipes(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.entities.FavoritesEntity favoritesEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFoodJoke(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.entities.FoodJokeEntity foodJokeEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFavoriteRecipe(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.entities.FavoritesEntity favoritesEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllFavoriteRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.RecipesDao recipesDao) {
        super();
    }
}