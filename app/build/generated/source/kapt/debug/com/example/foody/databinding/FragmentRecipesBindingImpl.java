package com.example.foody.databinding;
import com.example.foody.R;
import com.example.foody.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentRecipesBindingImpl extends FragmentRecipesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerview, 3);
        sViewsWithIds.put(R.id.recipes_fab, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRecipesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentRecipesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[4]
            , (com.todkars.shimmer.ShimmerRecyclerView) bindings[3]
            );
        this.errorImageView.setTag(null);
        this.errorTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.mainViewModel == variableId) {
            setMainViewModel((com.example.foody.viewmodels.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
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
                return onChangeMainViewModelReadRecipes((androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.RecipesEntity>>) object, fieldId);
            case 1 :
                return onChangeMainViewModelRecipesResponse((androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModelReadRecipes(androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.RecipesEntity>> MainViewModelReadRecipes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainViewModelRecipesResponse(androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> MainViewModelRecipesResponse, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.example.foody.viewmodels.MainViewModel mainViewModel = mMainViewModel;
        androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.RecipesEntity>> mainViewModelReadRecipes = null;
        com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe> mainViewModelRecipesResponseGetValue = null;
        androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodRecipe>> mainViewModelRecipesResponse = null;
        java.util.List<com.example.foody.data.database.entities.RecipesEntity> mainViewModelReadRecipesGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (mainViewModel != null) {
                    // read mainViewModel.readRecipes
                    mainViewModelReadRecipes = mainViewModel.getReadRecipes();
                    // read mainViewModel.recipesResponse
                    mainViewModelRecipesResponse = mainViewModel.getRecipesResponse();
                }
                updateLiveDataRegistration(0, mainViewModelReadRecipes);
                updateLiveDataRegistration(1, mainViewModelRecipesResponse);


                if (mainViewModelReadRecipes != null) {
                    // read mainViewModel.readRecipes.getValue()
                    mainViewModelReadRecipesGetValue = mainViewModelReadRecipes.getValue();
                }
                if (mainViewModelRecipesResponse != null) {
                    // read mainViewModel.recipesResponse.getValue()
                    mainViewModelRecipesResponseGetValue = mainViewModelRecipesResponse.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.example.foody.bindingadapters.RecipesBinding.errorImageViewVisibility(this.errorImageView, mainViewModelRecipesResponseGetValue, mainViewModelReadRecipesGetValue);
            com.example.foody.bindingadapters.RecipesBinding.errorTextViewVisibility(this.errorTextView, mainViewModelRecipesResponseGetValue, mainViewModelReadRecipesGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainViewModel.readRecipes
        flag 1 (0x2L): mainViewModel.recipesResponse
        flag 2 (0x3L): mainViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}