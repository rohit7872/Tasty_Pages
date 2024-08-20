package com.example.foody.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/foody/data/LocalDataSource;", "", "recipesDao", "Lcom/example/foody/data/database/RecipesDao;", "(Lcom/example/foody/data/database/RecipesDao;)V", "insertRecipes", "", "recipesEntity", "Lcom/example/foody/data/database/RecipesEntity;", "(Lcom/example/foody/data/database/RecipesEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDatabase", "Lkotlinx/coroutines/flow/Flow;", "", "app_debug"})
public final class LocalDataSource {
    private final com.example.foody.data.database.RecipesDao recipesDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.foody.data.database.RecipesEntity>> readDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertRecipes(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.RecipesEntity recipesEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.database.RecipesDao recipesDao) {
        super();
    }
}