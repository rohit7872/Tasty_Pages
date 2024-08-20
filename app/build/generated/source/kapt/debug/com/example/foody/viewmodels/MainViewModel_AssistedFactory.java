package com.example.foody.viewmodels;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.foody.data.Repository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<Repository> repository;

  private final Provider<Application> application;

  @Inject
  MainViewModel_AssistedFactory(Provider<Repository> repository,
      Provider<Application> application) {
    this.repository = repository;
    this.application = application;
  }

  @Override
  @NonNull
  public MainViewModel create(SavedStateHandle arg0) {
    return new MainViewModel(repository.get(), application.get());
  }
}
