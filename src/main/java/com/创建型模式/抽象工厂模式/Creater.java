package com.创建型模式.抽象工厂模式;

/**
 * 抽象工厂类
 * Created by Yuanping on 2017/10/13.
 */
public abstract class Creater {
    //抽象方法--创建产品A对象
    public abstract Product createProductA();
    //抽象方法--创建产品B对象
    public abstract Product createProductB();
}
