package com.行为型模式.类与类之间的关系.命令模式;

/**
 * Created by Yuanping on 2017/10/29.
 * 被调用者，模拟士兵
 */
public class Receiver {
    //执行命令
    public void action() {
        System.out.println("命令收到了，开始执行。");
    }
}
