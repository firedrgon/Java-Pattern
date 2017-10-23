package com.结构型模式.桥接模式;

/**
 * Created by Yuanping on 2017/10/21.
 * 相当于驱动管理器，DriverManager
 */
public class MyBridge extends Bridge {
    @Override
    public void connect() {
        getSource().connect();
    }
}
