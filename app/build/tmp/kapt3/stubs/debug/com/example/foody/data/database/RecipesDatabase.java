package com.example.foody.data.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.foody.data.database.RecipesTypeConverter.class})
@androidx.room.Database(entities = {com.example.foody.data.database.entities.RecipesEntity.class, com.example.foody.data.database.entities.FavoritesEntity.class, com.example.foody.data.database.entities.FoodJokeEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/foody/data/database/RecipesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "recipesDao", "Lcom/example/foody/data/database/RecipesDao;", "app_debug"})
public abstract class RecipesDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.foody.data.database.RecipesDao recipesDao();
    
    public RecipesDatabase() {
        super();
    }
}