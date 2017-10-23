package com.创建型模式.单例模式;

/**
 * Created by Yuanping on 2017/10/8.
 */
public class Singleton2 {
    //私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Singleton2 instance = null;

    //私有构造方法，防止被实例化
    private Singleton2() {
    }

    //静态工程方法，创建实例
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    //如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve() {
        return instance;
    }

    /**
     * 虽然对Singleton.java中的getInstance()方法加上了synchronized关键字，
     * 但是synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降
     * 因为每次调用getInstance()，都要对对象上锁
     *
     * 改动后的代码，请点击查看Singleton3.java
     */
}



















