package com.easyandroiddb;

/**
 * Created by 86180 on 2019/1/8.
 */

public class SQLiteDBManager {
    private static SQLiteDB mDb;

    public static SQLiteDB getDbSession() {
        return mDb;
    }

    public static void initialize(SQLiteDBConfig sqLiteDBConfig) {
        SQLiteDBManager.mDb = SQLiteDBFactory.createSQLiteDB(sqLiteDBConfig);
    }
}
