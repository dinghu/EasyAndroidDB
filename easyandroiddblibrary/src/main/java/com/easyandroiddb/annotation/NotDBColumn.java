package com.easyandroiddb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标识哪些字段不映射为数据库列
 * @author: huding
 * @time:	2018-8-13下午10:36:05
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NotDBColumn {

}
