package com.example.foody.data;

import android.content.Context;
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
public final class DataStoreRepository_Factory implements Factory<DataStoreRepository> {
  private final Provider<Context> contextProvider;

  public DataStoreRepository_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreRepository get() {
    return newInstance(contextProvider.get());
  }

  public static DataStoreRepository_Factory create(Provider<Context> contextProvider) {
    return new DataStoreRepository_Factory(contextProvider);
  }

  public static DataStoreRepository newInstance(Context context) {
    return new DataStoreRepository(context);
  }
}
