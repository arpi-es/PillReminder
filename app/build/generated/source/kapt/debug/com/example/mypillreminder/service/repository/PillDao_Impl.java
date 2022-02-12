package com.example.mypillreminder.service.repository;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.mypillreminder.service.model.Pill;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PillDao_Impl implements PillDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Pill> __insertionAdapterOfPill;

  private final EntityDeletionOrUpdateAdapter<Pill> __deletionAdapterOfPill;

  private final EntityDeletionOrUpdateAdapter<Pill> __updateAdapterOfPill;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllPills;

  public PillDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPill = new EntityInsertionAdapter<Pill>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `tblPills` (`_id`,`pillIdentifier`,`pillName`,`pillImage`,`interval`,`hasReminder`,`startTime`,`nextDose`,`endTime`,`lastTaken`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pill value) {
        stmt.bindLong(1, value.getId());
        if (value.getPillIdentifier() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPillIdentifier());
        }
        if (value.getPillName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPillName());
        }
        if (value.getPillImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPillImage());
        }
        stmt.bindLong(5, value.getInterval());
        final int _tmp;
        _tmp = value.getHasReminder() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        stmt.bindLong(7, value.getStartTime());
        stmt.bindLong(8, value.getNextDose());
        stmt.bindLong(9, value.getEndTime());
        stmt.bindLong(10, value.getLastTaken());
      }
    };
    this.__deletionAdapterOfPill = new EntityDeletionOrUpdateAdapter<Pill>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tblPills` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pill value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPill = new EntityDeletionOrUpdateAdapter<Pill>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tblPills` SET `_id` = ?,`pillIdentifier` = ?,`pillName` = ?,`pillImage` = ?,`interval` = ?,`hasReminder` = ?,`startTime` = ?,`nextDose` = ?,`endTime` = ?,`lastTaken` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pill value) {
        stmt.bindLong(1, value.getId());
        if (value.getPillIdentifier() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPillIdentifier());
        }
        if (value.getPillName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPillName());
        }
        if (value.getPillImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPillImage());
        }
        stmt.bindLong(5, value.getInterval());
        final int _tmp;
        _tmp = value.getHasReminder() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        stmt.bindLong(7, value.getStartTime());
        stmt.bindLong(8, value.getNextDose());
        stmt.bindLong(9, value.getEndTime());
        stmt.bindLong(10, value.getLastTaken());
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllPills = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from tblPills";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Pill pill) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPill.insert(pill);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Pill pill) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPill.handle(pill);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Pill pill) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPill.handle(pill);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllPills() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllPills.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllPills.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Pill>> getPills() {
    final String _sql = "SELECT * FROM tblPills ORDER BY _id Desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tblPills"}, false, new Callable<List<Pill>>() {
      @Override
      public List<Pill> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfPillIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "pillIdentifier");
          final int _cursorIndexOfPillName = CursorUtil.getColumnIndexOrThrow(_cursor, "pillName");
          final int _cursorIndexOfPillImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pillImage");
          final int _cursorIndexOfInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "interval");
          final int _cursorIndexOfHasReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "hasReminder");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfNextDose = CursorUtil.getColumnIndexOrThrow(_cursor, "nextDose");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfLastTaken = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTaken");
          final List<Pill> _result = new ArrayList<Pill>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Pill _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpPillIdentifier;
            _tmpPillIdentifier = _cursor.getString(_cursorIndexOfPillIdentifier);
            final String _tmpPillName;
            _tmpPillName = _cursor.getString(_cursorIndexOfPillName);
            final String _tmpPillImage;
            _tmpPillImage = _cursor.getString(_cursorIndexOfPillImage);
            final int _tmpInterval;
            _tmpInterval = _cursor.getInt(_cursorIndexOfInterval);
            final boolean _tmpHasReminder;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasReminder);
            _tmpHasReminder = _tmp != 0;
            final long _tmpStartTime;
            _tmpStartTime = _cursor.getLong(_cursorIndexOfStartTime);
            final long _tmpNextDose;
            _tmpNextDose = _cursor.getLong(_cursorIndexOfNextDose);
            final long _tmpEndTime;
            _tmpEndTime = _cursor.getLong(_cursorIndexOfEndTime);
            final long _tmpLastTaken;
            _tmpLastTaken = _cursor.getLong(_cursorIndexOfLastTaken);
            _item = new Pill(_tmpId,_tmpPillIdentifier,_tmpPillName,_tmpPillImage,_tmpInterval,_tmpHasReminder,_tmpStartTime,_tmpNextDose,_tmpEndTime,_tmpLastTaken);
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
  public List<Pill> getPillsList() {
    final String _sql = "SELECT * FROM tblPills ORDER BY _id Desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfPillIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "pillIdentifier");
      final int _cursorIndexOfPillName = CursorUtil.getColumnIndexOrThrow(_cursor, "pillName");
      final int _cursorIndexOfPillImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pillImage");
      final int _cursorIndexOfInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "interval");
      final int _cursorIndexOfHasReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "hasReminder");
      final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
      final int _cursorIndexOfNextDose = CursorUtil.getColumnIndexOrThrow(_cursor, "nextDose");
      final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
      final int _cursorIndexOfLastTaken = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTaken");
      final List<Pill> _result = new ArrayList<Pill>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Pill _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpPillIdentifier;
        _tmpPillIdentifier = _cursor.getString(_cursorIndexOfPillIdentifier);
        final String _tmpPillName;
        _tmpPillName = _cursor.getString(_cursorIndexOfPillName);
        final String _tmpPillImage;
        _tmpPillImage = _cursor.getString(_cursorIndexOfPillImage);
        final int _tmpInterval;
        _tmpInterval = _cursor.getInt(_cursorIndexOfInterval);
        final boolean _tmpHasReminder;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfHasReminder);
        _tmpHasReminder = _tmp != 0;
        final long _tmpStartTime;
        _tmpStartTime = _cursor.getLong(_cursorIndexOfStartTime);
        final long _tmpNextDose;
        _tmpNextDose = _cursor.getLong(_cursorIndexOfNextDose);
        final long _tmpEndTime;
        _tmpEndTime = _cursor.getLong(_cursorIndexOfEndTime);
        final long _tmpLastTaken;
        _tmpLastTaken = _cursor.getLong(_cursorIndexOfLastTaken);
        _item = new Pill(_tmpId,_tmpPillIdentifier,_tmpPillName,_tmpPillImage,_tmpInterval,_tmpHasReminder,_tmpStartTime,_tmpNextDose,_tmpEndTime,_tmpLastTaken);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<Pill> getPillById(final int pillID) {
    final String _sql = "SELECT * FROM tblPills WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pillID);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tblPills"}, false, new Callable<Pill>() {
      @Override
      public Pill call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfPillIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "pillIdentifier");
          final int _cursorIndexOfPillName = CursorUtil.getColumnIndexOrThrow(_cursor, "pillName");
          final int _cursorIndexOfPillImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pillImage");
          final int _cursorIndexOfInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "interval");
          final int _cursorIndexOfHasReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "hasReminder");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfNextDose = CursorUtil.getColumnIndexOrThrow(_cursor, "nextDose");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfLastTaken = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTaken");
          final Pill _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpPillIdentifier;
            _tmpPillIdentifier = _cursor.getString(_cursorIndexOfPillIdentifier);
            final String _tmpPillName;
            _tmpPillName = _cursor.getString(_cursorIndexOfPillName);
            final String _tmpPillImage;
            _tmpPillImage = _cursor.getString(_cursorIndexOfPillImage);
            final int _tmpInterval;
            _tmpInterval = _cursor.getInt(_cursorIndexOfInterval);
            final boolean _tmpHasReminder;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasReminder);
            _tmpHasReminder = _tmp != 0;
            final long _tmpStartTime;
            _tmpStartTime = _cursor.getLong(_cursorIndexOfStartTime);
            final long _tmpNextDose;
            _tmpNextDose = _cursor.getLong(_cursorIndexOfNextDose);
            final long _tmpEndTime;
            _tmpEndTime = _cursor.getLong(_cursorIndexOfEndTime);
            final long _tmpLastTaken;
            _tmpLastTaken = _cursor.getLong(_cursorIndexOfLastTaken);
            _result = new Pill(_tmpId,_tmpPillIdentifier,_tmpPillName,_tmpPillImage,_tmpInterval,_tmpHasReminder,_tmpStartTime,_tmpNextDose,_tmpEndTime,_tmpLastTaken);
          } else {
            _result = null;
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
  public Object getPillByIdentifier(final String pillIdentifier,
      final Continuation<? super Pill> p1) {
    final String _sql = "SELECT * FROM tblPills WHERE pillIdentifier = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (pillIdentifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, pillIdentifier);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Pill>() {
      @Override
      public Pill call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfPillIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "pillIdentifier");
          final int _cursorIndexOfPillName = CursorUtil.getColumnIndexOrThrow(_cursor, "pillName");
          final int _cursorIndexOfPillImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pillImage");
          final int _cursorIndexOfInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "interval");
          final int _cursorIndexOfHasReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "hasReminder");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfNextDose = CursorUtil.getColumnIndexOrThrow(_cursor, "nextDose");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfLastTaken = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTaken");
          final Pill _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpPillIdentifier;
            _tmpPillIdentifier = _cursor.getString(_cursorIndexOfPillIdentifier);
            final String _tmpPillName;
            _tmpPillName = _cursor.getString(_cursorIndexOfPillName);
            final String _tmpPillImage;
            _tmpPillImage = _cursor.getString(_cursorIndexOfPillImage);
            final int _tmpInterval;
            _tmpInterval = _cursor.getInt(_cursorIndexOfInterval);
            final boolean _tmpHasReminder;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasReminder);
            _tmpHasReminder = _tmp != 0;
            final long _tmpStartTime;
            _tmpStartTime = _cursor.getLong(_cursorIndexOfStartTime);
            final long _tmpNextDose;
            _tmpNextDose = _cursor.getLong(_cursorIndexOfNextDose);
            final long _tmpEndTime;
            _tmpEndTime = _cursor.getLong(_cursorIndexOfEndTime);
            final long _tmpLastTaken;
            _tmpLastTaken = _cursor.getLong(_cursorIndexOfLastTaken);
            _result = new Pill(_tmpId,_tmpPillIdentifier,_tmpPillName,_tmpPillImage,_tmpInterval,_tmpHasReminder,_tmpStartTime,_tmpNextDose,_tmpEndTime,_tmpLastTaken);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getLatestPill(final Continuation<? super Pill> p0) {
    final String _sql = "SELECT * FROM tblPills ORDER BY _id DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Pill>() {
      @Override
      public Pill call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfPillIdentifier = CursorUtil.getColumnIndexOrThrow(_cursor, "pillIdentifier");
          final int _cursorIndexOfPillName = CursorUtil.getColumnIndexOrThrow(_cursor, "pillName");
          final int _cursorIndexOfPillImage = CursorUtil.getColumnIndexOrThrow(_cursor, "pillImage");
          final int _cursorIndexOfInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "interval");
          final int _cursorIndexOfHasReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "hasReminder");
          final int _cursorIndexOfStartTime = CursorUtil.getColumnIndexOrThrow(_cursor, "startTime");
          final int _cursorIndexOfNextDose = CursorUtil.getColumnIndexOrThrow(_cursor, "nextDose");
          final int _cursorIndexOfEndTime = CursorUtil.getColumnIndexOrThrow(_cursor, "endTime");
          final int _cursorIndexOfLastTaken = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTaken");
          final Pill _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpPillIdentifier;
            _tmpPillIdentifier = _cursor.getString(_cursorIndexOfPillIdentifier);
            final String _tmpPillName;
            _tmpPillName = _cursor.getString(_cursorIndexOfPillName);
            final String _tmpPillImage;
            _tmpPillImage = _cursor.getString(_cursorIndexOfPillImage);
            final int _tmpInterval;
            _tmpInterval = _cursor.getInt(_cursorIndexOfInterval);
            final boolean _tmpHasReminder;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfHasReminder);
            _tmpHasReminder = _tmp != 0;
            final long _tmpStartTime;
            _tmpStartTime = _cursor.getLong(_cursorIndexOfStartTime);
            final long _tmpNextDose;
            _tmpNextDose = _cursor.getLong(_cursorIndexOfNextDose);
            final long _tmpEndTime;
            _tmpEndTime = _cursor.getLong(_cursorIndexOfEndTime);
            final long _tmpLastTaken;
            _tmpLastTaken = _cursor.getLong(_cursorIndexOfLastTaken);
            _result = new Pill(_tmpId,_tmpPillIdentifier,_tmpPillName,_tmpPillImage,_tmpInterval,_tmpHasReminder,_tmpStartTime,_tmpNextDose,_tmpEndTime,_tmpLastTaken);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
