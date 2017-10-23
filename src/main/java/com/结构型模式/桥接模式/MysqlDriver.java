package com.结构型模式.桥接模式;

/**
 * Created by Yuanping on 2017/10/21.
 * 实现了JDBC统一接口，这里可以比如成mysql的驱动连接实现
 */
public class MysqlDriver implements JdbcInterface {
    @Override
    public void connect() {
        System.out.println("mysql驱动连接mysql数据库...");
    }
}
