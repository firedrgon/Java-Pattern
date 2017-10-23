package com.创建型模式.建造者模式;

/**
 * Created by Yuanping on 2017/10/11.
 * 抽象builder
 */
public abstract class StarbucksBuilder {
    protected Starbucks starbucks;

    //返回创建的产品
    public Starbucks getStarbucks() {
        return starbucks;
    }

    //创建产品
    public void createStarbucks() {
        starbucks = new Starbucks();
        System.out.println("a drink is created");
    }

    //build产品具体的部件
    public abstract void buildSize();
    public abstract void buildDrink();
}
