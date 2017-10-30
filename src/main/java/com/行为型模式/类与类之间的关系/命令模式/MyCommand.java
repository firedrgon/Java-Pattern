package com.行为型模式.类与类之间的关系.命令模式;

/**
 * Created by Yuanping on 2017/10/29.
 */
public class MyCommand implements Command {
    //拥有士兵对象
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    //实现执行命令方法
    @Override
    public void exe() {
        receiver.action();
    }
}
