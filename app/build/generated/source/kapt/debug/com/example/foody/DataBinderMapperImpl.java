package com.example.foody;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.foody.databinding.FavoriteRecipesRowLayoutBindingImpl;
import com.example.foody.databinding.FragmentFavoriteRecipesBindingImpl;
import com.example.foody.databinding.FragmentFoodJokeBindingImpl;
import com.example.foody.databinding.FragmentFoodJokeBindingNightImpl;
import com.example.foody.databinding.FragmentRecipesBindingImpl;
import com.example.foody.databinding.RecipesRowLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FAVORITERECIPESROWLAYOUT = 1;

  private static final int LAYOUT_FRAGMENTFAVORITERECIPES = 2;

  private static final int LAYOUT_FRAGMENTFOODJOKE = 3;

  private static final int LAYOUT_FRAGMENTRECIPES = 4;

  private static final int LAYOUT_RECIPESROWLAYOUT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foody.R.layout.favorite_recipes_row_layout, LAYOUT_FAVORITERECIPESROWLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foody.R.layout.fragment_favorite_recipes, LAYOUT_FRAGMENTFAVORITERECIPES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foody.R.layout.fragment_food_joke, LAYOUT_FRAGMENTFOODJOKE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foody.R.layout.fragment_recipes, LAYOUT_FRAGMENTRECIPES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.foody.R.layout.recipes_row_layout, LAYOUT_RECIPESROWLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FAVORITERECIPESROWLAYOUT: {
          if ("layout/favorite_recipes_row_layout_0".equals(tag)) {
            return new FavoriteRecipesRowLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for favorite_recipes_row_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITERECIPES: {
          if ("layout/fragment_favorite_recipes_0".equals(tag)) {
            return new FragmentFavoriteRecipesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite_recipes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOODJOKE: {
          if ("layout/fragment_food_joke_0".equals(tag)) {
            return new FragmentFoodJokeBindingImpl(component, view);
          }
          if ("layout-night/fragment_food_joke_0".equals(tag)) {
            return new FragmentFoodJokeBindingNightImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_food_joke is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRECIPES: {
          if ("layout/fragment_recipes_0".equals(tag)) {
            return new FragmentRecipesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_recipes is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPESROWLAYOUT: {
          if ("layout/recipes_row_layout_0".equals(tag)) {
            return new RecipesRowLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipes_row_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "favoritesEntity");
      sKeys.put(2, "mAdapter");
      sKeys.put(3, "mainViewModel");
      sKeys.put(4, "result");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/favorite_recipes_row_layout_0", com.example.foody.R.layout.favorite_recipes_row_layout);
      sKeys.put("layout/fragment_favorite_recipes_0", com.example.foody.R.layout.fragment_favorite_recipes);
      sKeys.put("layout/fragment_food_joke_0", com.example.foody.R.layout.fragment_food_joke);
      sKeys.put("layout-night/fragment_food_joke_0", com.example.foody.R.layout.fragment_food_joke);
      sKeys.put("layout/fragment_recipes_0", com.example.foody.R.layout.fragment_recipes);
      sKeys.put("layout/recipes_row_layout_0", com.example.foody.R.layout.recipes_row_layout);
    }
  }
}
