package com.example.foody.databinding;
import com.example.foody.R;
import com.example.foody.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentFoodJokeBindingImpl extends FragmentFoodJokeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.food_joke_textView, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFoodJokeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentFoodJokeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ProgressBar) bindings[2]
            );
        this.foodJokeCardView.setTag(null);
        this.foodJokeErrorImageView.setTag(null);
        this.foodJokeErrorTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
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
                return onChangeMainViewModelReadFoodJoke((androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FoodJokeEntity>>) object, fieldId);
            case 1 :
                return onChangeMainViewModelFoodJokeResponse((androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModelReadFoodJoke(androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FoodJokeEntity>> MainViewModelReadFoodJoke, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainViewModelFoodJokeResponse(androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke>> MainViewModelFoodJokeResponse, int fieldId) {
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
        androidx.lifecycle.LiveData<java.util.List<com.example.foody.data.database.entities.FoodJokeEntity>> mainViewModelReadFoodJoke = null;
        java.util.List<com.example.foody.data.database.entities.FoodJokeEntity> mainViewModelReadFoodJokeGetValue = null;
        com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke> mainViewModelFoodJokeResponseGetValue = null;
        androidx.lifecycle.MutableLiveData<com.example.foody.util.NetworkResult<com.example.foody.models.FoodJoke>> mainViewModelFoodJokeResponse = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (mainViewModel != null) {
                    // read mainViewModel.readFoodJoke
                    mainViewModelReadFoodJoke = mainViewModel.getReadFoodJoke();
                    // read mainViewModel.foodJokeResponse
                    mainViewModelFoodJokeResponse = mainViewModel.getFoodJokeResponse();
                }
                updateLiveDataRegistration(0, mainViewModelReadFoodJoke);
                updateLiveDataRegistration(1, mainViewModelFoodJokeResponse);


                if (mainViewModelReadFoodJoke != null) {
                    // read mainViewModel.readFoodJoke.getValue()
                    mainViewModelReadFoodJokeGetValue = mainViewModelReadFoodJoke.getValue();
                }
                if (mainViewModelFoodJokeResponse != null) {
                    // read mainViewModel.foodJokeResponse.getValue()
                    mainViewModelFoodJokeResponseGetValue = mainViewModelFoodJokeResponse.getValue();
                }

            if ((dirtyFlags & 0xeL) != 0) {
            }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.example.foody.bindingadapters.FoodJokeBinding.setCardAndProgressVisibility(this.foodJokeCardView, mainViewModelFoodJokeResponseGetValue, mainViewModelReadFoodJokeGetValue);
            com.example.foody.bindingadapters.FoodJokeBinding.setErrorViewsVisibility(this.foodJokeErrorImageView, mainViewModelFoodJokeResponseGetValue, mainViewModelReadFoodJokeGetValue);
            com.example.foody.bindingadapters.FoodJokeBinding.setErrorViewsVisibility(this.foodJokeErrorTextView, mainViewModelFoodJokeResponseGetValue, mainViewModelReadFoodJokeGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.foody.bindingadapters.FoodJokeBinding.setCardAndProgressVisibility(this.progressBar, mainViewModelFoodJokeResponseGetValue, (java.util.List<com.example.foody.data.database.entities.FoodJokeEntity>)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainViewModel.readFoodJoke
        flag 1 (0x2L): mainViewModel.foodJokeResponse
        flag 2 (0x3L): mainViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}