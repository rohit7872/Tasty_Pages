package com.example.foody.databinding;
import com.example.foody.R;
import com.example.foody.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FavoriteRecipesRowLayoutBindingImpl extends FavoriteRecipesRowLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.favorite_row_cardView, 8);
        sViewsWithIds.put(R.id.favorite_heart_imageView, 9);
        sViewsWithIds.put(R.id.favorite_clock_imageView, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FavoriteRecipesRowLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FavoriteRecipesRowLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.favoriteClockTextView.setTag(null);
        this.favoriteDescriptionTextView.setTag(null);
        this.favoriteHeartTextView.setTag(null);
        this.favoriteLeafImageView.setTag(null);
        this.favoriteLeafTextView.setTag(null);
        this.favoriteRecipeImageView.setTag(null);
        this.favoriteRecipesRowLayout.setTag(null);
        this.favoriteTitleTextView.setTag(null);
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
        if (BR.favoritesEntity == variableId) {
            setFavoritesEntity((com.example.foody.data.database.entities.FavoritesEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFavoritesEntity(@Nullable com.example.foody.data.database.entities.FavoritesEntity FavoritesEntity) {
        this.mFavoritesEntity = FavoritesEntity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.favoritesEntity);
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
        boolean favoritesEntityResultVegan = false;
        java.lang.String favoritesEntityResultSummary = null;
        int favoritesEntityResultReadyInMinutes = 0;
        com.example.foody.models.Result favoritesEntityResult = null;
        java.lang.String favoritesEntityResultImage = null;
        java.lang.String favoritesEntityResultTitle = null;
        int favoritesEntityResultAggregateLikes = 0;
        com.example.foody.data.database.entities.FavoritesEntity favoritesEntity = mFavoritesEntity;

        if ((dirtyFlags & 0x3L) != 0) {



                if (favoritesEntity != null) {
                    // read favoritesEntity.result
                    favoritesEntityResult = favoritesEntity.getResult();
                }


                if (favoritesEntityResult != null) {
                    // read favoritesEntity.result.vegan
                    favoritesEntityResultVegan = favoritesEntityResult.getVegan();
                    // read favoritesEntity.result.summary
                    favoritesEntityResultSummary = favoritesEntityResult.getSummary();
                    // read favoritesEntity.result.readyInMinutes
                    favoritesEntityResultReadyInMinutes = favoritesEntityResult.getReadyInMinutes();
                    // read favoritesEntity.result.image
                    favoritesEntityResultImage = favoritesEntityResult.getImage();
                    // read favoritesEntity.result.title
                    favoritesEntityResultTitle = favoritesEntityResult.getTitle();
                    // read favoritesEntity.result.aggregateLikes
                    favoritesEntityResultAggregateLikes = favoritesEntityResult.getAggregateLikes();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.foody.bindingadapters.RecipesRowBinding.setNumberOfMinutes(this.favoriteClockTextView, favoritesEntityResultReadyInMinutes);
            com.example.foody.bindingadapters.RecipesRowBinding.parseHtml(this.favoriteDescriptionTextView, favoritesEntityResultSummary);
            com.example.foody.bindingadapters.RecipesRowBinding.setNumberOfLikes(this.favoriteHeartTextView, favoritesEntityResultAggregateLikes);
            com.example.foody.bindingadapters.RecipesRowBinding.applyVeganColor(this.favoriteLeafImageView, favoritesEntityResultVegan);
            com.example.foody.bindingadapters.RecipesRowBinding.applyVeganColor(this.favoriteLeafTextView, favoritesEntityResultVegan);
            com.example.foody.bindingadapters.RecipesRowBinding.loadImageFromUrl(this.favoriteRecipeImageView, favoritesEntityResultImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.favoriteTitleTextView, favoritesEntityResultTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): favoritesEntity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}