package com.行为型模式.通过中间类.中介者模式;

/**
 * Created by Yuanping on 2017/11/4.
 * 中介
 */
public interface Mediator {
    //管理user1,user2
    public void createMediator();

    //工作
    public void work();
}
