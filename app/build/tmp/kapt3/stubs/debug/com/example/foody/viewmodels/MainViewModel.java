package com.example.foody.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012J\u000e\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(J\u0019\u0010)\u001a\u00020*2\u0006\u0010\'\u001a\u00020(H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u001a\u0010,\u001a\u00020#2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0.J%\u0010/\u001a\u00020*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\n03H\u0002J\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c03H\u0002J\b\u00105\u001a\u000206H\u0003J\u000e\u00107\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012J\u0010\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u0016H\u0002J\u0010\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u0019H\u0002J\u0010\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\nH\u0002J\u0010\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020\u001cH\u0002J\u001a\u0010@\u001a\u00020#2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0.J%\u0010B\u001a\u00020*2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lcom/example/foody/viewmodels/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/example/foody/data/Repository;", "application", "Landroid/app/Application;", "(Lcom/example/foody/data/Repository;Landroid/app/Application;)V", "foodJokeResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/foody/util/NetworkResult;", "Lcom/example/foody/models/FoodJoke;", "getFoodJokeResponse", "()Landroidx/lifecycle/MutableLiveData;", "setFoodJokeResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "readFavoriteRecipes", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/foody/data/database/entities/FavoritesEntity;", "getReadFavoriteRecipes", "()Landroidx/lifecycle/LiveData;", "readFoodJoke", "Lcom/example/foody/data/database/entities/FoodJokeEntity;", "getReadFoodJoke", "readRecipes", "Lcom/example/foody/data/database/entities/RecipesEntity;", "getReadRecipes", "recipesResponse", "Lcom/example/foody/models/FoodRecipe;", "getRecipesResponse", "setRecipesResponse", "searchedRecipesResponse", "getSearchedRecipesResponse", "setSearchedRecipesResponse", "deleteAllFavoriteRecipes", "Lkotlinx/coroutines/Job;", "deleteFavoriteRecipe", "favoritesEntity", "getFoodJoke", "apiKey", "", "getFoodJokeSafeCall", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipes", "queries", "", "getRecipesSafeCall", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFoodJokeResponse", "response", "Lretrofit2/Response;", "handleFoodRecipesResponse", "hasInternetConnection", "", "insertFavoriteRecipe", "insertFoodJoke", "foodJokeEntity", "insertRecipes", "recipesEntity", "offlineCacheFoodJoke", "foodJoke", "offlineCacheRecipes", "foodRecipe", "searchRecipes", "searchQuery", "searchRecipesSafeCall", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * ROOM DATABASE
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.RecipesEntity>> readRecipes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FavoritesEntity>> readFavoriteRecipes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FoodJokeEntity>> readFoodJoke = null;
    
    /**
     * RETROFIT
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> recipesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> searchedRecipesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke>> foodJokeResponse;
    private final com.example.foody.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.RecipesEntity>> getReadRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FavoritesEntity>> getReadFavoriteRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FoodJokeEntity>> getReadFoodJoke() {
        return null;
    }
    
    private final kotlinx.coroutines.Job insertRecipes(com.example.foody.data.database.entities.RecipesEntity recipesEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFavoriteRecipe(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.entities.FavoritesEntity favoritesEntity) {
        return null;
    }
    
    private final kotlinx.coroutines.Job insertFoodJoke(com.example.foody.data.database.entities.FoodJokeEntity foodJokeEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFavoriteRecipe(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.entities.FavoritesEntity favoritesEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteAllFavoriteRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> getRecipesResponse() {
        return null;
    }
    
    public final void setRecipesResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> getSearchedRecipesResponse() {
        return null;
    }
    
    public final void setSearchedRecipesResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke>> getFoodJokeResponse() {
        return null;
    }
    
    public final void setFoodJokeResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getRecipes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queries) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchRecipes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> searchQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFoodJoke(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
        return null;
    }
    
    private final void offlineCacheRecipes(com.example.foody.models.FoodRecipe foodRecipe) {
    }
    
    private final void offlineCacheFoodJoke(com.example.foody.models.FoodJoke foodJoke) {
    }
    
    private final com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe> handleFoodRecipesResponse(retrofit2.Response<com.example.foody.models.FoodRecipe> response) {
        return null;
    }
    
    private final com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke> handleFoodJokeResponse(retrofit2.Response<com.example.foody.models.FoodJoke> response) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final boolean hasInternetConnection() {
        return false;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.Repository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}