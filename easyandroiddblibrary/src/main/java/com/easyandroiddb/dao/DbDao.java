package com.easyandroiddb.dao;

import java.util.List;

import com.easyandroiddb.SQLiteDBManager;


/**
 * Created by harry.ding on 2018/7/16.
 */

public class DbDao<T> implements DbBaseDao<T> {

    @Override
    public void save(T t) {
        SQLiteDBManager.getDbSession().save(t);
    }

    @Override
    public void delete(T t) {
        SQLiteDBManager.getDbSession().delete(t);
    }

    @Override
    public void update(T t) {
        SQLiteDBManager.getDbSession().update(t);
    }

    public List<T> selectAll(Class<T> mClass) {
        return SQLiteDBManager.getDbSession().queryAll(mClass);
    }

    public void deleteAll(Class<T> mClass) {
        SQLiteDBManager.getDbSession().deleteAll(mClass);
    }

    public void deleteByPrimaryKey(Class<T> table, String primaryKeyValue) {
        SQLiteDBManager.getDbSession().delete(table, primaryKeyValue);
    }

    public void delete(Class<T> table, String whereClause, String... whereArgs) {
        SQLiteDBManager.getDbSession().delete(table, whereClause, whereArgs);
    }

    public List<T> select(Class<T> table, String whereClause, String[] whereArgs, String orderBy) {
        return SQLiteDBManager.getDbSession().query(table, whereClause, whereArgs, orderBy);
    }

    public T selectByPrimaryKey(Class<T> table, String primaryKeyValue) {
        return SQLiteDBManager.getDbSession().query(table, primaryKeyValue);
    }

    public long selectTotal(Class<T> table) {
        return SQLiteDBManager.getDbSession().queryTotal(table);
    }
}
