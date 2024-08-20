package com.example.foody.viewmodels;

import android.app.Application;
import com.example.foody.data.DataStoreRepository;
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
public final class RecipesViewModel_AssistedFactory_Factory implements Factory<RecipesViewModel_AssistedFactory> {
  private final Provider<Application> applicationProvider;

  private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

  public RecipesViewModel_AssistedFactory_Factory(Provider<Application> applicationProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
  }

  @Override
  public RecipesViewModel_AssistedFactory get() {
    return newInstance(applicationProvider, dataStoreRepositoryProvider);
  }

  public static RecipesViewModel_AssistedFactory_Factory create(
      Provider<Application> applicationProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider) {
    return new RecipesViewModel_AssistedFactory_Factory(applicationProvider, dataStoreRepositoryProvider);
  }

  public static RecipesViewModel_AssistedFactory newInstance(Provider<Application> application,
      Provider<DataStoreRepository> dataStoreRepository) {
    return new RecipesViewModel_AssistedFactory(application, dataStoreRepository);
  }
}
