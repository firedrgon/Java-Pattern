package com.结构型模式.桥接模式;

/**
 * Created by Yuanping on 2017/10/21.
 * 实现了JDBC统一接口，这里可以必成oracle的驱动连接的实现
 */
public class OracleDriver implements JdbcInterface {
    @Override
    public void connect() {
        System.out.println("Oracle驱动连接Oracle数据库...");
    }
}
