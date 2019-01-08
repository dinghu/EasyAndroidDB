package com.easyandroiddb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

import com.easyandroiddb.listener.IDBListener;

public class EasyAndroidDB {
    private static final String DB_VERSION = "DB_VERSION";
    private static final String DB_NAME = "DB_NAME";
    private static final String DEFAULT_DB_NAME = "Tiger.db";

    private static String getMetaDataDatabaseNameOrDefault(Context context) {
        String dbName = getMetaData(context, DB_NAME);
        if (dbName == null || TextUtils.isEmpty(dbName)) {
            dbName = DEFAULT_DB_NAME;
        }
        return dbName;
    }

    private static int getMetaDataDatabaseVersionOrDefault(Context context) {
        Integer aaVersion = getMetaData(context, DB_VERSION);
        if (aaVersion == null || aaVersion == 0) {
            aaVersion = 1;
        }
        return aaVersion;
    }

    private static <T> T getMetaData(Context context, String name) {
        try {
            final ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(),
                    PackageManager.GET_META_DATA);

            if (ai.metaData != null) {
                return (T) ai.metaData.get(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void initialize(Context context, IDBListener dbListener) {
        SQLiteDBConfig mConfiguration = new SQLiteDBConfig(context);
        mConfiguration.setVersion(getMetaDataDatabaseVersionOrDefault(context));
        mConfiguration.setDbListener(dbListener);
        mConfiguration.setDbName(getMetaDataDatabaseNameOrDefault(context));
        SQLiteDBManager.initialize(mConfiguration);
    }
}
