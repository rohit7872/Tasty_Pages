package com.example.foody.data.database.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "favorite_recipes_table")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/foody/data/database/entities/FavoritesEntity;", "", "id", "", "result", "Lcom/example/foody/models/Result;", "(ILcom/example/foody/models/Result;)V", "getId", "()I", "setId", "(I)V", "getResult", "()Lcom/example/foody/models/Result;", "setResult", "(Lcom/example/foody/models/Result;)V", "app_debug"})
public final class FavoritesEntity {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    private com.example.foody.models.Result result;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foody.models.Result getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    com.example.foody.models.Result p0) {
    }
    
    public FavoritesEntity(int id, @org.jetbrains.annotations.NotNull()
    com.example.foody.models.Result result) {
        super();
    }
}