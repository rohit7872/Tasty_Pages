package com.example.foody.data;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J1\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/foody/data/DataStoreRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataStore", "Landroidx/datastore/DataStore;", "Landroidx/datastore/preferences/Preferences;", "readBackOnline", "Lkotlinx/coroutines/flow/Flow;", "", "getReadBackOnline", "()Lkotlinx/coroutines/flow/Flow;", "readMealAndDietType", "Lcom/example/foody/data/MealAndDietType;", "getReadMealAndDietType", "saveBackOnline", "", "backOnline", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMealAndDietType", "mealType", "", "mealTypeId", "", "dietType", "dietTypeId", "(Ljava/lang/String;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreferenceKeys", "app_debug"})
public final class DataStoreRepository {
    private final androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> dataStore = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.foody.data.MealAndDietType> readMealAndDietType = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> readBackOnline = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveMealAndDietType(@org.jetbrains.annotations.NotNull()
    java.lang.String mealType, int mealTypeId, @org.jetbrains.annotations.NotNull()
    java.lang.String dietType, int dietTypeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveBackOnline(boolean backOnline, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.foody.data.MealAndDietType> getReadMealAndDietType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getReadBackOnline() {
        return null;
    }
    
    @javax.inject.Inject()
    public DataStoreRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/foody/data/DataStoreRepository$PreferenceKeys;", "", "()V", "backOnline", "Landroidx/datastore/preferences/Preferences$Key;", "", "getBackOnline", "()Landroidx/datastore/preferences/Preferences$Key;", "selectedDietType", "", "getSelectedDietType", "selectedDietTypeId", "", "getSelectedDietTypeId", "selectedMealType", "getSelectedMealType", "selectedMealTypeId", "getSelectedMealTypeId", "app_debug"})
    static final class PreferenceKeys {
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.Preferences.Key<java.lang.String> selectedMealType = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.Preferences.Key<java.lang.Integer> selectedMealTypeId = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.Preferences.Key<java.lang.String> selectedDietType = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.Preferences.Key<java.lang.Integer> selectedDietTypeId = null;
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> backOnline = null;
        public static final com.example.foody.data.DataStoreRepository.PreferenceKeys INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.Preferences.Key<java.lang.String> getSelectedMealType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.Preferences.Key<java.lang.Integer> getSelectedMealTypeId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.Preferences.Key<java.lang.String> getSelectedDietType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.Preferences.Key<java.lang.Integer> getSelectedDietTypeId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.Preferences.Key<java.lang.Boolean> getBackOnline() {
            return null;
        }
        
        private PreferenceKeys() {
            super();
        }
    }
}