package com.example.foody.viewmodels;

import android.app.Application;
import com.example.foody.data.Repository;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<Application> applicationProvider;

  public MainViewModel_AssistedFactory_Factory(Provider<Repository> repositoryProvider,
      Provider<Application> applicationProvider) {
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider, applicationProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<Repository> repositoryProvider, Provider<Application> applicationProvider) {
    return new MainViewModel_AssistedFactory_Factory(repositoryProvider, applicationProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(Provider<Repository> repository,
      Provider<Application> application) {
    return new MainViewModel_AssistedFactory(repository, application);
  }
}
