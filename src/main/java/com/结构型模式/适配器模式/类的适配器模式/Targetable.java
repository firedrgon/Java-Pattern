package com.结构型模式.适配器模式.类的适配器模式;

/**
 * Created by Yuanping on 2017/10/15.
 * 目标接口
 */
public interface Targetable {
    //与原类中的方法相同，如Source类中的方法名称
    public void method1();
    //新的方法
    public void method2();
}
