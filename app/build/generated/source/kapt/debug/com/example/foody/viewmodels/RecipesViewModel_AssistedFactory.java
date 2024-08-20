package com.example.foody.viewmodels;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.foody.data.DataStoreRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class RecipesViewModel_AssistedFactory implements ViewModelAssistedFactory<RecipesViewModel> {
  private final Provider<Application> application;

  private final Provider<DataStoreRepository> dataStoreRepository;

  @Inject
  RecipesViewModel_AssistedFactory(Provider<Application> application,
      Provider<DataStoreRepository> dataStoreRepository) {
    this.application = application;
    this.dataStoreRepository = dataStoreRepository;
  }

  @Override
  @NonNull
  public RecipesViewModel create(SavedStateHandle arg0) {
    return new RecipesViewModel(application.get(), dataStoreRepository.get());
  }
}
