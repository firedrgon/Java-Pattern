package com.行为型模式.类与类之间的关系.观察者模式;

/**
 * Created by Yuanping on 2017/10/26.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者2接收到通知...");
    }
}
