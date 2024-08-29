package com.example.foody.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/foody/util/Constants;", "", "()V", "Companion", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.spoonacular.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_IMAGE_URL = "https://spoonacular.com/cdn/ingredients_100x100/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "de71d8d1ad8442be8ec734f03d64acab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECIPE_RESULT_KEY = "recipeBundle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_SEARCH = "query";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_NUMBER = "number";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_API_KEY = "apiKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_TYPE = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_DIET = "diet";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_ADD_RECIPE_INFORMATION = "addRecipeInformation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_FILL_INGREDIENTS = "fillIngredients";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "recipes_database";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECIPES_TABLE = "recipes_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAVORITE_RECIPES_TABLE = "favorite_recipes_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FOOD_JOKE_TABLE = "food_joke_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_RECIPES_NUMBER = "50";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_MEAL_TYPE = "main course";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_DIET_TYPE = "gluten free";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCES_NAME = "foody_preferences";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCES_MEAL_TYPE = "mealType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCES_MEAL_TYPE_ID = "mealTypeId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCES_DIET_TYPE = "dietType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCES_DIET_TYPE_ID = "dietTypeId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCES_BACK_ONLINE = "backOnline";
    public static final com.example.foody.util.Constants.Companion Companion = null;
    
    public Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/foody/util/Constants$Companion;", "", "()V", "API_KEY", "", "BASE_IMAGE_URL", "BASE_URL", "DATABASE_NAME", "DEFAULT_DIET_TYPE", "DEFAULT_MEAL_TYPE", "DEFAULT_RECIPES_NUMBER", "FAVORITE_RECIPES_TABLE", "FOOD_JOKE_TABLE", "PREFERENCES_BACK_ONLINE", "PREFERENCES_DIET_TYPE", "PREFERENCES_DIET_TYPE_ID", "PREFERENCES_MEAL_TYPE", "PREFERENCES_MEAL_TYPE_ID", "PREFERENCES_NAME", "QUERY_ADD_RECIPE_INFORMATION", "QUERY_API_KEY", "QUERY_DIET", "QUERY_FILL_INGREDIENTS", "QUERY_NUMBER", "QUERY_SEARCH", "QUERY_TYPE", "RECIPES_TABLE", "RECIPE_RESULT_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}