package com.结构型模式.桥接模式;

/**
 * Created by Yuanping on 2017/10/21.
 * 定义一个桥，持有JdbcInterface的一个实例
 */
public abstract class Bridge {
    private JdbcInterface jdbcInterface;

    /**
     * 连接数据库
     */
    public void connect() {
        jdbcInterface.connect();
    }

    public JdbcInterface getSource() {
        return jdbcInterface;
    }

    public void setSource(JdbcInterface source) {
        this.jdbcInterface = source;
    }
}
