package com.创建型模式.工厂方法模式.简单工程模式.普通工厂方法模式;

/**
 * Created by Yuanping on 2017/10/10.
 */
public class Test {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        //Sender sender = factory.produce("sms");//创建发送短信实现类

        //Sender sender = factory.produce("voice");//创建发送语音实现类

        Sender sender = factory.produce("mail");//创建发送邮件实现类

        //调用接口方法
        sender.send();
    }
}
