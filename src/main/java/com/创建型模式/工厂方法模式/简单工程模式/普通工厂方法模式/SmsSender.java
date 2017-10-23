package com.创建型模式.工厂方法模式.简单工程模式.普通工厂方法模式;

/**
 * 发送短信，实现Sender接口
 * Created by Yuanping on 2017/10/10.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("这是在发送短信...");
    }
}
