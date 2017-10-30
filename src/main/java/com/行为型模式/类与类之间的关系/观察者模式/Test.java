package com.行为型模式.类与类之间的关系.观察者模式;

/**
 * Created by Yuanping on 2017/10/26.
 */
public class Test {
    public static void main(String[] args) {
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

        Subject subject = new MySubject();
        //添加观察者
        subject.add(observer1);
        subject.add(observer2);

        //通知所有观察者
        subject.operation();
    }
}
