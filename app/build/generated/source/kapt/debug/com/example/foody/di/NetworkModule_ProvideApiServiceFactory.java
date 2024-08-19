package com.example.foody.di;

import com.example.foody.data.network.FoodRecipesApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiServiceFactory implements Factory<FoodRecipesApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public FoodRecipesApi get() {
    return provideApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static FoodRecipesApi provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideApiService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
