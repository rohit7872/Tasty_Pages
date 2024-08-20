package com.example.foody.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001dj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u001eJ*\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001dj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u001e2\u0006\u0010 \u001a\u00020\u000eJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%J\u0006\u0010\'\u001a\u00020(R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/example/foody/viewmodels/RecipesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dataStoreRepository", "Lcom/example/foody/data/DataStoreRepository;", "(Landroid/app/Application;Lcom/example/foody/data/DataStoreRepository;)V", "backOnline", "", "getBackOnline", "()Z", "setBackOnline", "(Z)V", "dietType", "", "mealType", "networkStatus", "getNetworkStatus", "setNetworkStatus", "readBackOnline", "Landroidx/lifecycle/LiveData;", "getReadBackOnline", "()Landroidx/lifecycle/LiveData;", "readMealAndDietType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/foody/data/MealAndDietType;", "getReadMealAndDietType", "()Lkotlinx/coroutines/flow/Flow;", "applyQueries", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "applySearchQuery", "searchQuery", "saveBackOnline", "Lkotlinx/coroutines/Job;", "saveMealAndDietType", "mealTypeId", "", "dietTypeId", "showNetworkStatus", "", "app_debug"})
public final class RecipesViewModel extends androidx.lifecycle.AndroidViewModel {
    private java.lang.String mealType = "main course";
    private java.lang.String dietType = "gluten free";
    private boolean networkStatus = false;
    private boolean backOnline = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.foody.data.MealAndDietType> readMealAndDietType = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> readBackOnline = null;
    private final com.example.foody.data.DataStoreRepository dataStoreRepository = null;
    
    public final boolean getNetworkStatus() {
        return false;
    }
    
    public final void setNetworkStatus(boolean p0) {
    }
    
    public final boolean getBackOnline() {
        return false;
    }
    
    public final void setBackOnline(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.foody.data.MealAndDietType> getReadMealAndDietType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getReadBackOnline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveMealAndDietType(@org.jetbrains.annotations.NotNull()
    java.lang.String mealType, int mealTypeId, @org.jetbrains.annotations.NotNull()
    java.lang.String dietType, int dietTypeId) {
        return null;
    }
    
    private final kotlinx.coroutines.Job saveBackOnline(boolean backOnline) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> applyQueries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> applySearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
    
    public final void showNetworkStatus() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public RecipesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.example.foody.data.DataStoreRepository dataStoreRepository) {
        super(null);
    }
}