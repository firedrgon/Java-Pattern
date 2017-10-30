package com.行为型模式.类与类之间的关系.观察者模式;

/**
 * Created by Yuanping on 2017/10/26.
 */
public interface Subject {
    //增加观察者
    public void add(Observer observer);
    //删除观察者
    public void del(Observer observer);
    //通知所以观察者
    public void notifyObservers();
    //自身的操作
    public void operation();
}
