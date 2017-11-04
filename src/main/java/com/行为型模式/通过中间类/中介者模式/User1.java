package com.行为型模式.通过中间类.中介者模式;

/**
 * Created by Yuanping on 2017/11/4.
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
