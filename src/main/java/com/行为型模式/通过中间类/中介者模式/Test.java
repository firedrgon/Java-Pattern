package com.行为型模式.通过中间类.中介者模式;

/**
 * Created by Yuanping on 2017/11/4.
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();

        //管理对象与中介的关系
        mediator.createMediator();
        //中介管理调用对象的方法
        mediator.work();
    }
}
