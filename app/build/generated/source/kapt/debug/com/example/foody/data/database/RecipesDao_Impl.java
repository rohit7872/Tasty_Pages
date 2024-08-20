package com.example.foody.data.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.foody.models.FoodRecipe;
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
}
