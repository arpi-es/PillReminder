package com.example.mypillreminder.service.repository;

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

@SuppressWarnings({"unchecked", "deprecation"})
public final class PillDatabase_Impl extends PillDatabase {
  private volatile PillDao _pillDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tblPills` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `pillIdentifier` TEXT NOT NULL, `pillName` TEXT NOT NULL, `pillImage` TEXT NOT NULL, `interval` INTEGER NOT NULL, `hasReminder` INTEGER NOT NULL, `startTime` INTEGER NOT NULL, `nextDose` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `lastTaken` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ac2e539d55e78fa725598f0c95390f08')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tblPills`");
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
        final HashMap<String, TableInfo.Column> _columnsTblPills = new HashMap<String, TableInfo.Column>(10);
        _columnsTblPills.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("pillIdentifier", new TableInfo.Column("pillIdentifier", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("pillName", new TableInfo.Column("pillName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("pillImage", new TableInfo.Column("pillImage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("interval", new TableInfo.Column("interval", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("hasReminder", new TableInfo.Column("hasReminder", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("startTime", new TableInfo.Column("startTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("nextDose", new TableInfo.Column("nextDose", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("endTime", new TableInfo.Column("endTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTblPills.put("lastTaken", new TableInfo.Column("lastTaken", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTblPills = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTblPills = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTblPills = new TableInfo("tblPills", _columnsTblPills, _foreignKeysTblPills, _indicesTblPills);
        final TableInfo _existingTblPills = TableInfo.read(_db, "tblPills");
        if (! _infoTblPills.equals(_existingTblPills)) {
          return new RoomOpenHelper.ValidationResult(false, "tblPills(com.example.mypillreminder.service.model.Pill).\n"
                  + " Expected:\n" + _infoTblPills + "\n"
                  + " Found:\n" + _existingTblPills);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ac2e539d55e78fa725598f0c95390f08", "9c63cd5616bcff220c9fb8d860b1de31");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tblPills");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tblPills`");
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
  public PillDao getPillDao() {
    if (_pillDao != null) {
      return _pillDao;
    } else {
      synchronized(this) {
        if(_pillDao == null) {
          _pillDao = new PillDao_Impl(this);
        }
        return _pillDao;
      }
    }
  }
}
