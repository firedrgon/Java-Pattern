package com.行为型模式.类与类之间的关系.观察者模式;

/**
 * Created by Yuanping on 2017/10/26.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("开始更新自身的信息...");
        notifyObservers();
    }
}
