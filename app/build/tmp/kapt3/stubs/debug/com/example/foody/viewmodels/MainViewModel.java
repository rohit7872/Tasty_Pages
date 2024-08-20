package com.example.foody.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bJ%\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\nH\u0002J\u0010\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u0010H\u0002J\u001a\u0010)\u001a\u00020\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bJ%\u0010+\u001a\u00020\u001e2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/example/foody/viewmodels/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/example/foody/data/Repository;", "application", "Landroid/app/Application;", "(Lcom/example/foody/data/Repository;Landroid/app/Application;)V", "readRecipes", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/foody/data/database/RecipesEntity;", "getReadRecipes", "()Landroidx/lifecycle/LiveData;", "recipesResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/foody/util/NetworkResult;", "Lcom/example/foody/models/FoodRecipe;", "getRecipesResponse", "()Landroidx/lifecycle/MutableLiveData;", "setRecipesResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "searchedRecipesResponse", "getSearchedRecipesResponse", "setSearchedRecipesResponse", "getRecipes", "Lkotlinx/coroutines/Job;", "queries", "", "", "getRecipesSafeCall", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFoodRecipesResponse", "response", "Lretrofit2/Response;", "hasInternetConnection", "", "insertRecipes", "recipesEntity", "offlineCacheRecipes", "foodRecipe", "searchRecipes", "searchQuery", "searchRecipesSafeCall", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * ROOM DATABASE
     */
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.RecipesEntity>> readRecipes = null;
    
    /**
     * RETROFIT
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> recipesResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> searchedRecipesResponse;
    private final com.example.foody.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.RecipesEntity>> getReadRecipes() {
        return null;
    }
    
    private final kotlinx.coroutines.Job insertRecipes(com.example.foody.data.database.RecipesEntity recipesEntity) {
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
    public final kotlinx.coroutines.Job getRecipes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queries) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job searchRecipes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> searchQuery) {
        return null;
    }
    
    private final void offlineCacheRecipes(com.example.foody.models.FoodRecipe foodRecipe) {
    }
    
    private final com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe> handleFoodRecipesResponse(retrofit2.Response<com.example.foody.models.FoodRecipe> response) {
        return null;
    }
    
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