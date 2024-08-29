package com.example.foody.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\u0006\u0010 \u001a\u00020\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u001c\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010&\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020\u001cH\u0016J\u001c\u0010(\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010)H\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001cH\u0016J\u0012\u0010.\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010/\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010)H\u0016J\u0014\u00100\u001a\u00020\u00162\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u000204H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/example/foody/adapters/FavoriteRecipesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/foody/adapters/FavoriteRecipesAdapter$MyViewHolder;", "Landroid/view/ActionMode$Callback;", "requireActivity", "Landroidx/fragment/app/FragmentActivity;", "mainViewModel", "Lcom/example/foody/viewmodels/MainViewModel;", "(Landroidx/fragment/app/FragmentActivity;Lcom/example/foody/viewmodels/MainViewModel;)V", "favoriteRecipes", "", "Lcom/example/foody/data/database/entities/FavoritesEntity;", "mActionMode", "Landroid/view/ActionMode;", "multiSelection", "", "myViewHolders", "Ljava/util/ArrayList;", "rootView", "Landroid/view/View;", "selectedRecipes", "applyActionModeTitle", "", "applySelection", "holder", "currentRecipe", "applyStatusBarColor", "color", "", "changeRecipeStyle", "backgroundColor", "strokeColor", "clearContextualActionMode", "getItemCount", "onActionItemClicked", "actionMode", "menu", "Landroid/view/MenuItem;", "onBindViewHolder", "position", "onCreateActionMode", "Landroid/view/Menu;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDestroyActionMode", "onPrepareActionMode", "setData", "newFavoriteRecipes", "showSnackBar", "message", "", "MyViewHolder", "app_debug"})
public final class FavoriteRecipesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder> implements android.view.ActionMode.Callback {
    private boolean multiSelection = false;
    private android.view.ActionMode mActionMode;
    private android.view.View rootView;
    private java.util.ArrayList<com.example.foody.data.database.entities.FavoritesEntity> selectedRecipes;
    private java.util.ArrayList<com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder> myViewHolders;
    private java.util.List<com.example.foody.data.database.entities.FavoritesEntity> favoriteRecipes;
    private final androidx.fragment.app.FragmentActivity requireActivity = null;
    private final com.example.foody.viewmodels.MainViewModel mainViewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder holder, int position) {
    }
    
    private final void applySelection(com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder holder, com.example.foody.data.database.entities.FavoritesEntity currentRecipe) {
    }
    
    private final void changeRecipeStyle(com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder holder, int backgroundColor, int strokeColor) {
    }
    
    private final void applyActionModeTitle() {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode actionMode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode actionMode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode actionMode, @org.jetbrains.annotations.Nullable()
    android.view.MenuItem menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode actionMode) {
    }
    
    private final void applyStatusBarColor(int color) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.foody.data.database.entities.FavoritesEntity> newFavoriteRecipes) {
    }
    
    private final void showSnackBar(java.lang.String message) {
    }
    
    public final void clearContextualActionMode() {
    }
    
    public FavoriteRecipesAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity requireActivity, @org.jetbrains.annotations.NotNull()
    com.example.foody.viewmodels.MainViewModel mainViewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/foody/adapters/FavoriteRecipesAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/foody/databinding/FavoriteRecipesRowLayoutBinding;", "(Lcom/example/foody/databinding/FavoriteRecipesRowLayoutBinding;)V", "bind", "", "favoritesEntity", "Lcom/example/foody/data/database/entities/FavoritesEntity;", "Companion", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.foody.databinding.FavoriteRecipesRowLayoutBinding binding = null;
        public static final com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.foody.data.database.entities.FavoritesEntity favoritesEntity) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.foody.databinding.FavoriteRecipesRowLayoutBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/foody/adapters/FavoriteRecipesAdapter$MyViewHolder$Companion;", "", "()V", "from", "Lcom/example/foody/adapters/FavoriteRecipesAdapter$MyViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.foody.adapters.FavoriteRecipesAdapter.MyViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}