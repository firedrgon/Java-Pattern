package com.创建型模式.抽象工厂模式;

/**
 * 具体工厂类，继承抽象工厂Creater
 * Created by Yuanping on 2017/10/13.
 */
public class Create1 extends Creater {
    //创建产品A1
    @Override
    public Product createProductA() {
        return new ProductA1();
    }

    //创建产品B1
    @Override
    public Product createProductB() {
        return new ProductB1();
    }
}
