package com.example.foody.di;

import com.example.foody.data.database.RecipesDao;
import com.example.foody.data.database.RecipesDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideDaoFactory implements Factory<RecipesDao> {
  private final Provider<RecipesDatabase> databaseProvider;

  public DatabaseModule_ProvideDaoFactory(Provider<RecipesDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RecipesDao get() {
    return provideDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideDaoFactory create(
      Provider<RecipesDatabase> databaseProvider) {
    return new DatabaseModule_ProvideDaoFactory(databaseProvider);
  }

  public static RecipesDao provideDao(RecipesDatabase database) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
