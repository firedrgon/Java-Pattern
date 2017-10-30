package com.行为型模式.类与类之间的关系.命令模式;

/**
 * Created by Yuanping on 2017/10/29.
 */
public class Test {
    public static void main(String[] args) {
        //创建士兵
        Receiver receiver = new Receiver();
        //创建命令
        Command command = new MyCommand(receiver);
        //创建司机对象
        Invoker invoker = new Invoker(command);
        //发起命令
        invoker.action();
    }
}
