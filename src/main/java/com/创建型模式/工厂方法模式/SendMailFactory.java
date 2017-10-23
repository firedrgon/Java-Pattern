package com.创建型模式.工厂方法模式;

/**
 * 发送邮件工厂
 * Created by Yuanping on 2017/10/10.
 */
public class SendMailFactory implements Provider {
    /**
     * 生产，创建邮件发送实例
     * @return
     */
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
