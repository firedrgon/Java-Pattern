package com.创建型模式.工厂方法模式.简单工程模式.多个静态方法模式;

/**
 * Created by Yuanping on 2017/10/10.
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }


    public static Sender produceSms() {
        return new SmsSender();
    }
}
