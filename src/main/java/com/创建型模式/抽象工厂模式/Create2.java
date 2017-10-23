package com.创建型模式.抽象工厂模式;

/**
 * 具体工厂类，继承抽象工厂Creater
 * Created by Yuanping on 2017/10/13.
 */
public class Create2 extends Creater {
    //创建产品A2
    @Override
    public Product createProductA() {
        return new ProductA2();
    }

    //创建产品B2
    @Override
    public Product createProductB() {
        return new ProductB2();
    }
}
