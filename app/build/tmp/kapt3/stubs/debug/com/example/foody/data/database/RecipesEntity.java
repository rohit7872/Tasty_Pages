package com.example.foody.data.database;

import java.lang.System;

@androidx.room.Entity(tableName = "recipes_table")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/foody/data/database/RecipesEntity;", "", "foodRecipe", "Lcom/example/foody/models/FoodRecipe;", "(Lcom/example/foody/models/FoodRecipe;)V", "getFoodRecipe", "()Lcom/example/foody/models/FoodRecipe;", "setFoodRecipe", "id", "", "getId", "()I", "setId", "(I)V", "app_debug"})
public final class RecipesEntity {
    @androidx.room.PrimaryKey(autoGenerate = false)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private com.example.foody.models.FoodRecipe foodRecipe;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.foody.models.FoodRecipe getFoodRecipe() {
        return null;
    }
    
    public final void setFoodRecipe(@org.jetbrains.annotations.NotNull()
    com.example.foody.models.FoodRecipe p0) {
    }
    
    public RecipesEntity(@org.jetbrains.annotations.NotNull()
    com.example.foody.models.FoodRecipe foodRecipe) {
        super();
    }
}