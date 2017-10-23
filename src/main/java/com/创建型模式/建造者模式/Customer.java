package com.创建型模式.建造者模式;

/**
 * Created by Yuanping on 2017/10/11.
 * 客户
 */
public class Customer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        //客户需要咖啡
        StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
        waiter.setStarbucksBuilder(coffeeBuilder);
        //制作咖啡
        waiter.constructStarbucks();
        //客户拿到咖啡
        Starbucks drink = waiter.getStarbucksDrink();
    }
}
