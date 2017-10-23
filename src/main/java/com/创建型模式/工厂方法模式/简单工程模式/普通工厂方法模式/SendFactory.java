package com.创建型模式.工厂方法模式.简单工程模式.普通工厂方法模式;

/**
 * Created by Yuanping on 2017/10/10.
 */
public class SendFactory {
    /**
     * 根据输入的参数，判断创建不同的实现类
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
