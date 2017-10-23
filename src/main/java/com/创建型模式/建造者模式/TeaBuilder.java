package com.创建型模式.建造者模式;

/**
 * Created by Yuanping on 2017/10/11.
 * 泡茶builder
 */
public class TeaBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        starbucks.setSize("large");
        System.out.println("build large size");
    }

    @Override
    public void buildDrink() {
        starbucks.setDrink("tea");
        System.out.println("build tea");
    }
}
