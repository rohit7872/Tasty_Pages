package com.example.foody.viewmodels;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = RecipesViewModel.class
)
public interface RecipesViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.foody.viewmodels.RecipesViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(RecipesViewModel_AssistedFactory factory);
}
