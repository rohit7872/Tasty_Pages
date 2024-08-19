package com.example.foody.data;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/foody/data/Repository;", "", "remoteDataSource", "Lcom/example/foody/data/RemoteDataSource;", "(Lcom/example/foody/data/RemoteDataSource;)V", "remote", "getRemote", "()Lcom/example/foody/data/RemoteDataSource;", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.foody.data.RemoteDataSource remote = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foody.data.RemoteDataSource getRemote() {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.example.foody.data.RemoteDataSource remoteDataSource) {
        super();
    }
}