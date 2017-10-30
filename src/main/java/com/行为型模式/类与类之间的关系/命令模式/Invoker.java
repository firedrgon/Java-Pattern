package com.行为型模式.类与类之间的关系.命令模式;

/**
 * Created by Yuanping on 2017/10/29.
 * 模拟司令
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    //发起命令
    public void action() {
        command.exe();
    }
}
