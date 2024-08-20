package com.example.foody.databinding;
import com.example.foody.R;
import com.example.foody.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RecipesRowLayoutBindingImpl extends RecipesRowLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.row_cardView, 8);
        sViewsWithIds.put(R.id.heart_imageView, 9);
        sViewsWithIds.put(R.id.clock_imageView, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecipesRowLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private RecipesRowLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.card.MaterialCardView) bindings[8]
            , (android.widget.TextView) bindings[2]
            );
        this.clockTextView.setTag(null);
        this.descriptionTextView.setTag(null);
        this.heartTextView.setTag(null);
        this.leafImageView.setTag(null);
        this.leafTextView.setTag(null);
        this.recipeImageView.setTag(null);
        this.recipesRowLayout.setTag(null);
        this.titleTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.result == variableId) {
            setResult((com.example.foody.models.Result) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResult(@Nullable com.example.foody.models.Result Result) {
        this.mResult = Result;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.result);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String resultTitle = null;
        int resultReadyInMinutes = 0;
        java.lang.String resultImage = null;
        com.example.foody.models.Result result = mResult;
        boolean resultVegan = false;
        int resultAggregateLikes = 0;
        java.lang.String resultSummary = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (result != null) {
                    // read result.title
                    resultTitle = result.getTitle();
                    // read result.readyInMinutes
                    resultReadyInMinutes = result.getReadyInMinutes();
                    // read result.image
                    resultImage = result.getImage();
                    // read result.vegan
                    resultVegan = result.getVegan();
                    // read result.aggregateLikes
                    resultAggregateLikes = result.getAggregateLikes();
                    // read result.summary
                    resultSummary = result.getSummary();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.foody.bindingadapters.RecipesRowBinding.setNumberOfMinutes(this.clockTextView, resultReadyInMinutes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionTextView, resultSummary);
            com.example.foody.bindingadapters.RecipesRowBinding.setNumberOfLikes(this.heartTextView, resultAggregateLikes);
            com.example.foody.bindingadapters.RecipesRowBinding.applyVeganColor(this.leafImageView, resultVegan);
            com.example.foody.bindingadapters.RecipesRowBinding.applyVeganColor(this.leafTextView, resultVegan);
            com.example.foody.bindingadapters.RecipesRowBinding.loadImageFromUrl(this.recipeImageView, resultImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, resultTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): result
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}