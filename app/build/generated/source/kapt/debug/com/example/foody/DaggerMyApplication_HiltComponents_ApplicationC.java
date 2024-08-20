package com.example.foody;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.foody.data.DataStoreRepository;
import com.example.foody.data.LocalDataSource;
import com.example.foody.data.RemoteDataSource;
import com.example.foody.data.Repository;
import com.example.foody.data.database.RecipesDao;
import com.example.foody.data.database.RecipesDatabase;
import com.example.foody.data.network.FoodRecipesApi;
import com.example.foody.di.DatabaseModule;
import com.example.foody.di.DatabaseModule_ProvideDaoFactory;
import com.example.foody.di.DatabaseModule_ProvideDatabaseFactory;
import com.example.foody.di.NetworkModule;
import com.example.foody.di.NetworkModule_ProvideApiServiceFactory;
import com.example.foody.di.NetworkModule_ProvideConverterFactoryFactory;
import com.example.foody.di.NetworkModule_ProvideHttpClientFactory;
import com.example.foody.di.NetworkModule_ProvideRetrofitInstanceFactory;
import com.example.foody.ui.MainActivity;
import com.example.foody.ui.fragments.recipes.RecipesFragment;
import com.example.foody.viewmodels.MainViewModel_AssistedFactory;
import com.example.foody.viewmodels.MainViewModel_AssistedFactory_Factory;
import com.example.foody.viewmodels.RecipesViewModel_AssistedFactory;
import com.example.foody.viewmodels.RecipesViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyApplication_HiltComponents_ApplicationC extends MyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object gsonConverterFactory = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object foodRecipesApi = new MemoizedSentinel();

  private volatile Object recipesDatabase = new MemoizedSentinel();

  private volatile Object recipesDao = new MemoizedSentinel();

  private volatile Provider<Application> provideApplicationProvider;

  private DaggerMyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideHttpClientFactory.provideHttpClient();
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private GsonConverterFactory getGsonConverterFactory() {
    Object local = gsonConverterFactory;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gsonConverterFactory;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideConverterFactoryFactory.provideConverterFactory();
          gsonConverterFactory = DoubleCheck.reentrantCheck(gsonConverterFactory, local);
        }
      }
    }
    return (GsonConverterFactory) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideRetrofitInstanceFactory.provideRetrofitInstance(getOkHttpClient(), getGsonConverterFactory());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private FoodRecipesApi getFoodRecipesApi() {
    Object local = foodRecipesApi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodRecipesApi;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideApiServiceFactory.provideApiService(getRetrofit());
          foodRecipesApi = DoubleCheck.reentrantCheck(foodRecipesApi, local);
        }
      }
    }
    return (FoodRecipesApi) local;
  }

  private RecipesDatabase getRecipesDatabase() {
    Object local = recipesDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = recipesDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          recipesDatabase = DoubleCheck.reentrantCheck(recipesDatabase, local);
        }
      }
    }
    return (RecipesDatabase) local;
  }

  private RecipesDao getRecipesDao() {
    Object local = recipesDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = recipesDao;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideDaoFactory.provideDao(getRecipesDatabase());
          recipesDao = DoubleCheck.reentrantCheck(recipesDao, local);
        }
      }
    }
    return (RecipesDao) local;
  }

  private Provider<Application> getApplicationProvider() {
    Object local = provideApplicationProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideApplicationProvider = (Provider<Application>) local;
    }
    return (Provider<Application>) local;
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public MyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private volatile Object repository = new MemoizedSentinel();

    private volatile Provider<Repository> repositoryProvider;

    private volatile Object dataStoreRepository = new MemoizedSentinel();

    private volatile Provider<DataStoreRepository> dataStoreRepositoryProvider;

    private ActivityRetainedCImpl() {

    }

    private RemoteDataSource getRemoteDataSource() {
      return new RemoteDataSource(DaggerMyApplication_HiltComponents_ApplicationC.this.getFoodRecipesApi());
    }

    private LocalDataSource getLocalDataSource() {
      return new LocalDataSource(DaggerMyApplication_HiltComponents_ApplicationC.this.getRecipesDao());
    }

    private Repository getRepository() {
      Object local = repository;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = repository;
          if (local instanceof MemoizedSentinel) {
            local = new Repository(getRemoteDataSource(), getLocalDataSource());
            repository = DoubleCheck.reentrantCheck(repository, local);
          }
        }
      }
      return (Repository) local;
    }

    private Provider<Repository> getRepositoryProvider() {
      Object local = repositoryProvider;
      if (local == null) {
        local = new SwitchingProvider<>(0);
        repositoryProvider = (Provider<Repository>) local;
      }
      return (Provider<Repository>) local;
    }

    private DataStoreRepository getDataStoreRepository() {
      Object local = dataStoreRepository;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = dataStoreRepository;
          if (local instanceof MemoizedSentinel) {
            local = new DataStoreRepository(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule));
            dataStoreRepository = DoubleCheck.reentrantCheck(dataStoreRepository, local);
          }
        }
      }
      return (DataStoreRepository) local;
    }

    private Provider<DataStoreRepository> getDataStoreRepositoryProvider() {
      Object local = dataStoreRepositoryProvider;
      if (local == null) {
        local = new SwitchingProvider<>(1);
        dataStoreRepositoryProvider = (Provider<DataStoreRepository>) local;
      }
      return (Provider<DataStoreRepository>) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private volatile Provider<RecipesViewModel_AssistedFactory> recipesViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(ActivityRetainedCImpl.this.getRepositoryProvider(), DaggerMyApplication_HiltComponents_ApplicationC.this.getApplicationProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private RecipesViewModel_AssistedFactory getRecipesViewModel_AssistedFactory() {
        return RecipesViewModel_AssistedFactory_Factory.newInstance(DaggerMyApplication_HiltComponents_ApplicationC.this.getApplicationProvider(), ActivityRetainedCImpl.this.getDataStoreRepositoryProvider());
      }

      private Provider<RecipesViewModel_AssistedFactory> getRecipesViewModel_AssistedFactoryProvider(
          ) {
        Object local = recipesViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          recipesViewModel_AssistedFactoryProvider = (Provider<RecipesViewModel_AssistedFactory>) local;
        }
        return (Provider<RecipesViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.example.foody.viewmodels.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider()).put("com.example.foody.viewmodels.RecipesViewModel", (Provider) getRecipesViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectRecipesFragment(RecipesFragment recipesFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.foody.viewmodels.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            case 1: // com.example.foody.viewmodels.RecipesViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getRecipesViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }

    private final class SwitchingProvider<T> implements Provider<T> {
      private final int id;

      SwitchingProvider(int id) {
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.foody.data.Repository 
          return (T) ActivityRetainedCImpl.this.getRepository();

          case 1: // com.example.foody.data.DataStoreRepository 
          return (T) ActivityRetainedCImpl.this.getDataStoreRepository();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // android.app.Application 
        return (T) ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule);

        default: throw new AssertionError(id);
      }
    }
  }
}
