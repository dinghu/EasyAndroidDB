package cn.ding.hu.easyandroiddb.model;


import com.easyandroiddb.annotation.Column;
import com.easyandroiddb.annotation.PrimaryKey;

public class User {
    @PrimaryKey(isAutoGenerate = true)
    public long id;
    public String name;
    @Column(defaultValue = "1")
    public int age;
    @Column(defaultValue = "1")
    public int sex;
//    @Column(defaultValue = "1")
//    public int sexx;

    public User() {
    }

    public User(String name) {
        super();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{id=" + id + ",name=" + name + "}";
    }
}