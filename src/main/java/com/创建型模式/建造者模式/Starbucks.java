package com.创建型模式.建造者模式;

/**
 * Created by Yuanping on 2017/10/11.
 * 待构建的产品
 */
public class Starbucks {
    private String size;
    private String drink;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
