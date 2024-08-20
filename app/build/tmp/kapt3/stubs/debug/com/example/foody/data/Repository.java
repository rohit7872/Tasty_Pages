package com.example.foody.data;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/foody/data/Repository;", "", "remoteDataSource", "Lcom/example/foody/data/RemoteDataSource;", "localDataSource", "Lcom/example/foody/data/LocalDataSource;", "(Lcom/example/foody/data/RemoteDataSource;Lcom/example/foody/data/LocalDataSource;)V", "local", "getLocal", "()Lcom/example/foody/data/LocalDataSource;", "remote", "getRemote", "()Lcom/example/foody/data/RemoteDataSource;", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.foody.data.RemoteDataSource remote = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.foody.data.LocalDataSource local = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foody.data.RemoteDataSource getRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foody.data.LocalDataSource getLocal() {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.example.foody.data.LocalDataSource localDataSource) {
        super();
    }
}