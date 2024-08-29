package com.example.foody.data.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.foody.data.database.entities.FavoritesEntity;
import com.example.foody.data.database.entities.FoodJokeEntity;
import com.example.foody.data.database.entities.RecipesEntity;
import com.example.foody.models.FoodJoke;
import com.example.foody.models.FoodRecipe;
import com.example.foody.models.Result;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipesDao_Impl implements RecipesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecipesEntity> __insertionAdapterOfRecipesEntity;

  private final RecipesTypeConverter __recipesTypeConverter = new RecipesTypeConverter();

  private final EntityInsertionAdapter<FavoritesEntity> __insertionAdapterOfFavoritesEntity;

  private final EntityInsertionAdapter<FoodJokeEntity> __insertionAdapterOfFoodJokeEntity;

  private final EntityDeletionOrUpdateAdapter<FavoritesEntity> __deletionAdapterOfFavoritesEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFavoriteRecipes;

  public RecipesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecipesEntity = new EntityInsertionAdapter<RecipesEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `recipes_table` (`id`,`foodRecipe`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecipesEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __recipesTypeConverter.foodRecipeToString(value.getFoodRecipe());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__insertionAdapterOfFavoritesEntity = new EntityInsertionAdapter<FavoritesEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_recipes_table` (`id`,`result`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoritesEntity value) {
        stmt.bindLong(1, value.getId());
        final String _tmp;
        _tmp = __recipesTypeConverter.resultToString(value.getResult());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__insertionAdapterOfFoodJokeEntity = new EntityInsertionAdapter<FoodJokeEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `food_joke_table` (`id`,`text`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodJokeEntity value) {
        stmt.bindLong(1, value.getId());
        final FoodJoke _tmpFoodJoke = value.getFoodJoke();
        if(_tmpFoodJoke != null) {
          if (_tmpFoodJoke.getText() == null) {
            stmt.bindNull(2);
          } else {
            stmt.bindString(2, _tmpFoodJoke.getText());
          }
        } else {
          stmt.bindNull(2);
        }
      }
    };
    this.__deletionAdapterOfFavoritesEntity = new EntityDeletionOrUpdateAdapter<FavoritesEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorite_recipes_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavoritesEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllFavoriteRecipes = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favorite_recipes_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertRecipes(final RecipesEntity recipesEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRecipesEntity.insert(recipesEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertFavoriteRecipe(final FavoritesEntity favoritesEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoritesEntity.insert(favoritesEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertFoodJoke(final FoodJokeEntity foodJokeEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFoodJokeEntity.insert(foodJokeEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteFavoriteRecipe(final FavoritesEntity favoritesEntity,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavoritesEntity.handle(favoritesEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllFavoriteRecipes(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFavoriteRecipes.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllFavoriteRecipes.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Flow<List<RecipesEntity>> readRecipes() {
    final String _sql = "SELECT * FROM recipes_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"recipes_table"}, new Callable<List<RecipesEntity>>() {
      @Override
      public List<RecipesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFoodRecipe = CursorUtil.getColumnIndexOrThrow(_cursor, "foodRecipe");
          final List<RecipesEntity> _result = new ArrayList<RecipesEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecipesEntity _item;
            final FoodRecipe _tmpFoodRecipe;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfFoodRecipe);
            _tmpFoodRecipe = __recipesTypeConverter.stringToFoodRecipe(_tmp);
            _item = new RecipesEntity(_tmpFoodRecipe);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FavoritesEntity>> readFavoriteRecipes() {
    final String _sql = "SELECT * FROM favorite_recipes_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"favorite_recipes_table"}, new Callable<List<FavoritesEntity>>() {
      @Override
      public List<FavoritesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
          final List<FavoritesEntity> _result = new ArrayList<FavoritesEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavoritesEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Result _tmpResult;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfResult);
            _tmpResult = __recipesTypeConverter.stringToResult(_tmp);
            _item = new FavoritesEntity(_tmpId,_tmpResult);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<FoodJokeEntity>> readFoodJoke() {
    final String _sql = "SELECT * FROM food_joke_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"food_joke_table"}, new Callable<List<FoodJokeEntity>>() {
      @Override
      public List<FoodJokeEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final List<FoodJokeEntity> _result = new ArrayList<FoodJokeEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FoodJokeEntity _item;
            final FoodJoke _tmpFoodJoke;
            if (! (_cursor.isNull(_cursorIndexOfText))) {
              final String _tmpText;
              _tmpText = _cursor.getString(_cursorIndexOfText);
              _tmpFoodJoke = new FoodJoke(_tmpText);
            }  else  {
              _tmpFoodJoke = null;
            }
            _item = new FoodJokeEntity(_tmpFoodJoke);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
