package com.example.foody.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0007J%\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0003R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/foody/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/example/foody/data/Repository;", "application", "Landroid/app/Application;", "(Lcom/example/foody/data/Repository;Landroid/app/Application;)V", "recipesResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/foody/utils/NetworkResult;", "Lcom/example/foody/model/FoodRecipe;", "getRecipesResponse", "()Landroidx/lifecycle/MutableLiveData;", "setRecipesResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "getRecipes", "Lkotlinx/coroutines/Job;", "queries", "", "", "getRecipesSafeCall", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFoodRecipesResponse", "response", "Lretrofit2/Response;", "hasInternetConnection", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.foody.utils.NetworkResult<com.example.foody.model.FoodRecipe>> recipesResponse;
    private final com.example.foody.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.foody.utils.NetworkResult<com.example.foody.model.FoodRecipe>> getRecipesResponse() {
        return null;
    }
    
    public final void setRecipesResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.foody.utils.NetworkResult<com.example.foody.model.FoodRecipe>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final kotlinx.coroutines.Job getRecipes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queries) {
        return null;
    }
    
    private final com.example.foody.utils.NetworkResult<com.example.foody.model.FoodRecipe> handleFoodRecipesResponse(retrofit2.Response<com.example.foody.model.FoodRecipe> response) {
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