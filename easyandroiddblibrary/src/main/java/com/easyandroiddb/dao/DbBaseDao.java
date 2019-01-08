package com.easyandroiddb.dao;


/**
 * Created by harry.ding on 2018/7/11.
 */

public interface DbBaseDao<T> {

    void save(T t);

    void delete(T t);

    void update(T t);
}
