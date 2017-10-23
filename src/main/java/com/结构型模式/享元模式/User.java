package com.结构型模式.享元模式;

/**
 * Created by Yuanping on 2017/10/23.
 */
public class User {
    private String userName;
    private String passWd;

    public User(String userName, String passWd) {
        this.userName = userName;
        this.passWd = passWd;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWd() {
        return passWd;
    }
}
