package com.创建型模式.建造者模式;

/**
 * Created by Yuanping on 2017/10/11.
 */
public class CoffeeBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("medium");
        System.out.println("build medium coffee");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("coffee");
        System.out.println("build coffee");
    }
}
