package com.example.foody.data;

import com.example.foody.data.database.RecipesDao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataSource_Factory implements Factory<LocalDataSource> {
  private final Provider<RecipesDao> recipesDaoProvider;

  public LocalDataSource_Factory(Provider<RecipesDao> recipesDaoProvider) {
    this.recipesDaoProvider = recipesDaoProvider;
  }

  @Override
  public LocalDataSource get() {
    return newInstance(recipesDaoProvider.get());
  }

  public static LocalDataSource_Factory create(Provider<RecipesDao> recipesDaoProvider) {
    return new LocalDataSource_Factory(recipesDaoProvider);
  }

  public static LocalDataSource newInstance(RecipesDao recipesDao) {
    return new LocalDataSource(recipesDao);
  }
}
