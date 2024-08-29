package com.example.foody.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/foody/ui/DetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "args", "Lcom/example/foody/ui/DetailsActivityArgs;", "getArgs", "()Lcom/example/foody/ui/DetailsActivityArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "mainViewModel", "Lcom/example/foody/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/example/foody/viewmodels/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "recipeSaved", "", "savedRecipeId", "", "changeMenuItemColor", "", "item", "Landroid/view/MenuItem;", "color", "checkSavedRecipes", "menuItem", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "removeFromFavorites", "saveToFavorites", "showSnackBar", "message", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private boolean recipeSaved = false;
    private int savedRecipeId = 0;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.foody.ui.DetailsActivityArgs getArgs() {
        return null;
    }
    
    private final com.example.foody.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void checkSavedRecipes(android.view.MenuItem menuItem) {
    }
    
    private final void saveToFavorites(android.view.MenuItem item) {
    }
    
    private final void removeFromFavorites(android.view.MenuItem item) {
    }
    
    private final void showSnackBar(java.lang.String message) {
    }
    
    private final void changeMenuItemColor(android.view.MenuItem item, int color) {
    }
    
    public DetailsActivity() {
        super();
    }
}