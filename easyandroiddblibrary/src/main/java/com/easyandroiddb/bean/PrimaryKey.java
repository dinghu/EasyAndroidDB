package com.easyandroiddb.bean;

/**
 * 主键字段
 * Author: huding
 * Time: 2018-8-14下午10:05:58
 */
public class PrimaryKey extends Property {
	/**
	 * 当前主键是否为自增长
	 */
	private boolean isAutoGenerate;

	public boolean isAutoGenerate() {
		return isAutoGenerate;
	}

	public void setAutoGenerate(boolean isAutoGenerate) {
		this.isAutoGenerate = isAutoGenerate;
	}
}
