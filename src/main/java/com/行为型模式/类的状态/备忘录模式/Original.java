package com.行为型模式.类的状态.备忘录模式;

/**
 * Created by Yuanping on 2017/10/30.
 * 原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值
 */
public class Original {
    //需要保存备份的属性
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //创建备忘录
    public Memento createMemento() {
        return new Memento(value);
    }

    //还原
    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }
}






























