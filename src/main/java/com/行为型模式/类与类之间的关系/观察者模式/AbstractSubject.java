package com.行为型模式.类与类之间的关系.观察者模式;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Yuanping on 2017/10/26.
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();

    /**
     * 添加观察者
     *
     * */
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }


    /**
     * 删除观察者*/
    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    /**
     * 通知观察者
*/
    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}
