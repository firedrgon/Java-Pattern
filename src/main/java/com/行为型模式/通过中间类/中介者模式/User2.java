package com.行为型模式.通过中间类.中介者模式;

/**
 * Created by Yuanping on 2017/11/4.
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
