package com.example.foody.data.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipesDatabase_Impl extends RecipesDatabase {
  private volatile RecipesDao _recipesDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `recipes_table` (`id` INTEGER NOT NULL, `foodRecipe` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_recipes_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `result` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `food_joke_table` (`id` INTEGER NOT NULL, `text` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8b0559db028e55141e5e89d382d86a36')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `recipes_table`");
        _db.execSQL("DROP TABLE IF EXISTS `favorite_recipes_table`");
        _db.execSQL("DROP TABLE IF EXISTS `food_joke_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRecipesTable = new HashMap<String, TableInfo.Column>(2);
        _columnsRecipesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipesTable.put("foodRecipe", new TableInfo.Column("foodRecipe", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecipesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecipesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecipesTable = new TableInfo("recipes_table", _columnsRecipesTable, _foreignKeysRecipesTable, _indicesRecipesTable);
        final TableInfo _existingRecipesTable = TableInfo.read(_db, "recipes_table");
        if (! _infoRecipesTable.equals(_existingRecipesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "recipes_table(com.example.foody.data.database.entities.RecipesEntity).\n"
                  + " Expected:\n" + _infoRecipesTable + "\n"
                  + " Found:\n" + _existingRecipesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteRecipesTable = new HashMap<String, TableInfo.Column>(2);
        _columnsFavoriteRecipesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteRecipesTable.put("result", new TableInfo.Column("result", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteRecipesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteRecipesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteRecipesTable = new TableInfo("favorite_recipes_table", _columnsFavoriteRecipesTable, _foreignKeysFavoriteRecipesTable, _indicesFavoriteRecipesTable);
        final TableInfo _existingFavoriteRecipesTable = TableInfo.read(_db, "favorite_recipes_table");
        if (! _infoFavoriteRecipesTable.equals(_existingFavoriteRecipesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_recipes_table(com.example.foody.data.database.entities.FavoritesEntity).\n"
                  + " Expected:\n" + _infoFavoriteRecipesTable + "\n"
                  + " Found:\n" + _existingFavoriteRecipesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFoodJokeTable = new HashMap<String, TableInfo.Column>(2);
        _columnsFoodJokeTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFoodJokeTable.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFoodJokeTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFoodJokeTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFoodJokeTable = new TableInfo("food_joke_table", _columnsFoodJokeTable, _foreignKeysFoodJokeTable, _indicesFoodJokeTable);
        final TableInfo _existingFoodJokeTable = TableInfo.read(_db, "food_joke_table");
        if (! _infoFoodJokeTable.equals(_existingFoodJokeTable)) {
          return new RoomOpenHelper.ValidationResult(false, "food_joke_table(com.example.foody.data.database.entities.FoodJokeEntity).\n"
                  + " Expected:\n" + _infoFoodJokeTable + "\n"
                  + " Found:\n" + _existingFoodJokeTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8b0559db028e55141e5e89d382d86a36", "e32113512332a95477d6d31d6e15573d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "recipes_table","favorite_recipes_table","food_joke_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `recipes_table`");
      _db.execSQL("DELETE FROM `favorite_recipes_table`");
      _db.execSQL("DELETE FROM `food_joke_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RecipesDao recipesDao() {
    if (_recipesDao != null) {
      return _recipesDao;
    } else {
      synchronized(this) {
        if(_recipesDao == null) {
          _recipesDao = new RecipesDao_Impl(this);
        }
        return _recipesDao;
      }
    }
  }
}
