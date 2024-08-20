package com.example.foody.ui.fragments.recipes;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010$\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u00010/H\u0016J\b\u00102\u001a\u00020\u001cH\u0002J\b\u00103\u001a\u00020\u001cH\u0002J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020/H\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/example/foody/ui/fragments/recipes/RecipesFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "_binding", "Lcom/example/foody/databinding/FragmentRecipesBinding;", "args", "Lcom/example/foody/ui/fragments/recipes/RecipesFragmentArgs;", "getArgs", "()Lcom/example/foody/ui/fragments/recipes/RecipesFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/example/foody/databinding/FragmentRecipesBinding;", "mAdapter", "Lcom/example/foody/adapters/RecipesAdapter;", "getMAdapter", "()Lcom/example/foody/adapters/RecipesAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mainViewModel", "Lcom/example/foody/viewmodels/MainViewModel;", "networkListener", "Lcom/example/foody/util/NetworkListener;", "recipesViewModel", "Lcom/example/foody/viewmodels/RecipesViewModel;", "hideShimmerEffect", "", "loadDataFromCache", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onQueryTextChange", "", "p0", "", "onQueryTextSubmit", "query", "readDatabase", "requestApiData", "searchApiData", "searchQuery", "setupRecyclerView", "showShimmerEffect", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RecipesFragment extends androidx.fragment.app.Fragment implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.example.foody.databinding.FragmentRecipesBinding _binding;
    private com.example.foody.viewmodels.MainViewModel mainViewModel;
    private com.example.foody.viewmodels.RecipesViewModel recipesViewModel;
    private final kotlin.Lazy mAdapter$delegate = null;
    private com.example.foody.util.NetworkListener networkListener;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.foody.ui.fragments.recipes.RecipesFragmentArgs getArgs() {
        return null;
    }
    
    private final com.example.foody.databinding.FragmentRecipesBinding getBinding() {
        return null;
    }
    
    private final com.example.foody.adapters.RecipesAdapter getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
        return false;
    }
    
    private final void readDatabase() {
    }
    
    private final void requestApiData() {
    }
    
    private final void searchApiData(java.lang.String searchQuery) {
    }
    
    private final void loadDataFromCache() {
    }
    
    private final void showShimmerEffect() {
    }
    
    private final void hideShimmerEffect() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public RecipesFragment() {
        super();
    }
}