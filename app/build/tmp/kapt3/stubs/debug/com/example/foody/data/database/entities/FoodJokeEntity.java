package com.example.foody.data.database.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "food_joke_table")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/foody/data/database/entities/FoodJokeEntity;", "", "foodJoke", "Lcom/example/foody/models/FoodJoke;", "(Lcom/example/foody/models/FoodJoke;)V", "getFoodJoke", "()Lcom/example/foody/models/FoodJoke;", "setFoodJoke", "id", "", "getId", "()I", "setId", "(I)V", "app_debug"})
public final class FoodJokeEntity {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private com.example.foody.models.FoodJoke foodJoke;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foody.models.FoodJoke getFoodJoke() {
        return null;
    }
    
    public final void setFoodJoke(@org.jetbrains.annotations.NotNull()
    com.example.foody.models.FoodJoke p0) {
    }
    
    public FoodJokeEntity(@org.jetbrains.annotations.NotNull()
    com.example.foody.models.FoodJoke foodJoke) {
        super();
    }
}