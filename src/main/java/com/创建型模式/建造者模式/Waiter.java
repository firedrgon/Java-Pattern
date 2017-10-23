package com.创建型模式.建造者模式;

/**
 * Created by Yuanping on 2017/10/11.
 * 指导如何封装builder
 */
public class Waiter {
    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder builder) {
        starbucksBuilder = builder;
    }

    public Starbucks getStarbucksDrink() {
        return starbucksBuilder.getStarbucks();
    }

    public void constructStarbucks() {
        starbucksBuilder.createStarbucks();
        starbucksBuilder.buildSize();
        starbucksBuilder.buildDrink();
    }
}
