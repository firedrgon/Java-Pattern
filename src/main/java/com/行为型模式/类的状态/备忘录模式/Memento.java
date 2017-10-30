package com.行为型模式.类的状态.备忘录模式;

/**
 * Created by Yuanping on 2017/10/30.
 * 备忘录类
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
