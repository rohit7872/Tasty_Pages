package com.example.foody.databinding;
import com.example.foody.R;
import com.example.foody.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentFavoriteRecipesBindingImpl extends FragmentFavoriteRecipesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFavoriteRecipesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentFavoriteRecipesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.favoriteRecipesRecyclerView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.noDataImageView.setTag(null);
        this.noDataTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mAdapter == variableId) {
            setMAdapter((com.example.foody.adapters.FavoriteRecipesAdapter) variable);
        }
        else if (BR.mainViewModel == variableId) {
            setMainViewModel((com.example.foody.viewmodels.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMAdapter(@Nullable com.example.foody.adapters.FavoriteRecipesAdapter MAdapter) {
        this.mMAdapter = MAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mAdapter);
        super.requestRebind();
    }
    public void setMainViewModel(@Nullable com.example.foody.viewmodels.MainViewModel MainViewModel) {
        this.mMainViewModel = MainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mainViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainViewModelReadFavoriteRecipes((androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FavoritesEntity>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModelReadFavoriteRecipes(androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FavoritesEntity>> MainViewModelReadFavoriteRecipes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.foody.adapters.FavoriteRecipesAdapter mAdapter = mMAdapter;
        java.util.List<com.example.foody.data.database.entities.FavoritesEntity> mainViewModelReadFavoriteRecipesGetValue = null;
        com.example.foody.viewmodels.MainViewModel mainViewModel = mMainViewModel;
        androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FavoritesEntity>> mainViewModelReadFavoriteRecipes = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (mainViewModel != null) {
                    // read mainViewModel.readFavoriteRecipes
                    mainViewModelReadFavoriteRecipes = mainViewModel.getReadFavoriteRecipes();
                }
                updateLiveDataRegistration(0, mainViewModelReadFavoriteRecipes);


                if (mainViewModelReadFavoriteRecipes != null) {
                    // read mainViewModel.readFavoriteRecipes.getValue()
                    mainViewModelReadFavoriteRecipesGetValue = mainViewModelReadFavoriteRecipes.getValue();
                }

            if ((dirtyFlags & 0xdL) != 0) {
            }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.example.foody.bindingadapters.FavoriteRecipesBinding.setDataAndViewVisibility(this.favoriteRecipesRecyclerView, mainViewModelReadFavoriteRecipesGetValue, mAdapter);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.foody.bindingadapters.FavoriteRecipesBinding.setDataAndViewVisibility(this.noDataImageView, mainViewModelReadFavoriteRecipesGetValue, (com.example.foody.adapters.FavoriteRecipesAdapter)null);
            com.example.foody.bindingadapters.FavoriteRecipesBinding.setDataAndViewVisibility(this.noDataTextView, mainViewModelReadFavoriteRecipesGetValue, (com.example.foody.adapters.FavoriteRecipesAdapter)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainViewModel.readFavoriteRecipes
        flag 1 (0x2L): mAdapter
        flag 2 (0x3L): mainViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}