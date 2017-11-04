package com.行为型模式.通过中间类.中介者模式;

/**
 * Created by Yuanping on 2017/11/4.
 */
public class MyMediator implements Mediator {
    private User user1;
    private User user2;

    //管理user1，user2
    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    //工作
    @Override
    public void work() {
        user1.work();
        user1.work();
    }
}
