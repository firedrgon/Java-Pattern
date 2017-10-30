package com.行为型模式.类的状态.备忘录模式;

/**
 * Created by Yuanping on 2017/10/30.
 * 存储备忘录的类
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
