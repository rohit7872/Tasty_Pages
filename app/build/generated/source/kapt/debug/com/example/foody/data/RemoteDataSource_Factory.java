package com.example.foody.data;

import com.example.foody.data.network.FoodRecipesApi;
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
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<FoodRecipesApi> foodRecipesApiProvider;

  public RemoteDataSource_Factory(Provider<FoodRecipesApi> foodRecipesApiProvider) {
    this.foodRecipesApiProvider = foodRecipesApiProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(foodRecipesApiProvider.get());
  }

  public static RemoteDataSource_Factory create(Provider<FoodRecipesApi> foodRecipesApiProvider) {
    return new RemoteDataSource_Factory(foodRecipesApiProvider);
  }

  public static RemoteDataSource newInstance(FoodRecipesApi foodRecipesApi) {
    return new RemoteDataSource(foodRecipesApi);
  }
}
