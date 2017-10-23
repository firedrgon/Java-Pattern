package com.创建型模式.工厂方法模式.简单工程模式.多个工厂方法模式;

/**
 * Created by Yuanping on 2017/10/10.
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }


    public Sender produceSms() {
        return new SmsSender();
    }
}
