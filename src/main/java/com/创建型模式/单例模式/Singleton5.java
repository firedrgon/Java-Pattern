package com.创建型模式.单例模式;

/**
 * Created by Yuanping on 2017/10/8.
 */
public class Singleton5 {
    private static Singleton5 instance = null;

    private Singleton5() {
    }

    //单独为创建对象方法加上synchronized关键字
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton5();
        }
    }

    //获取实例的方法和创建实例对象的方法分开
    public static Singleton5 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}























