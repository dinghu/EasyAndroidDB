package com.easyandroiddb;

import android.content.Context;

import com.easyandroiddb.listener.IDBListener;
import com.easyandroiddb.listener.SimpleDBListener;


/**
 * 数据库相关配置
 *
 * @author: huylee
 * @time: 2015-8-12下午10:22:59
 */
public final class SQLiteDBConfig {
    /**
     * 默认数据库名，可修改
     */
    public static String DEFAULT_DB_NAME = "Tiger.db";
    /**
     * 默认版本号，可修改
     */
    public static int DEFAULT_VERSION = 1;
    /**
     * 数据库上下文
     */
    private Context mContext;
    /**
     * 数据库文件名,默认为：Tiger.db
     */
    private String mDbName = DEFAULT_DB_NAME;
    /**
     * 当前数据库版本号
     */
    private int mVersion = DEFAULT_VERSION;
    /**
     * 数据库监听
     */
    private IDBListener mDbListener;

    public SQLiteDBConfig(Context context) {
        this.mContext = context;
        mDbListener = new SimpleDBListener();
    }

    public SQLiteDBConfig(Context context, String dbName) {
        super();
        this.mContext = context;
        this.mDbName = dbName;
        mDbListener = new SimpleDBListener();
    }

    /**
     * 获取数据库所在的上下文
     *
     * @return
     * @author: huylee
     * @time: 2015-8-12下午10:28:35
     */
    public Context getContext() {
        return mContext;
    }

    /**
     * 设置数据库所在的上下文
     *
     * @param mContext
     * @author: huylee
     * @time: 2015-8-12下午10:29:03
     */
    public void setContext(Context mContext) {
        this.mContext = mContext;
    }

    public String getDbName() {
        return mDbName;
    }

    public void setDbName(String mDbName) {
        this.mDbName = mDbName;
    }

    public int getVersion() {
        return mVersion;
    }

    public void setVersion(int mVersion) {
        this.mVersion = mVersion;
    }

    public IDBListener getDbListener() {
        return mDbListener;
    }

    public void setDbListener(IDBListener mDbListener) {
        this.mDbListener = mDbListener;
    }
}
