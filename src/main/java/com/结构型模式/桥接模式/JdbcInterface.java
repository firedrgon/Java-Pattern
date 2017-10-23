package com.结构型模式.桥接模式;

/**
 * Created by Yuanping on 2017/10/21.
 * JDBC连接的统一接口，具体的又各大数据库厂家进行实现连接
 */
public interface JdbcInterface {
    /**
     * 连接数据库
     */
    public void connect();
}
