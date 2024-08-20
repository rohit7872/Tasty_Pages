package com.example.foody.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/foody/data/RemoteDataSource;", "", "foodRecipesApi", "Lcom/example/foody/data/network/FoodRecipesApi;", "(Lcom/example/foody/data/network/FoodRecipesApi;)V", "getRecipes", "Lretrofit2/Response;", "Lcom/example/foody/models/FoodRecipe;", "queries", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchRecipes", "searchQuery", "app_debug"})
public final class RemoteDataSource {
    private final com.example.foody.data.network.FoodRecipesApi foodRecipesApi = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRecipes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queries, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.foody.models.FoodRecipe>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchRecipes(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.foody.models.FoodRecipe>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.network.FoodRecipesApi foodRecipesApi) {
        super();
    }
}