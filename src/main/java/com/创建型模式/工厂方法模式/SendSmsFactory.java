package com.创建型模式.工厂方法模式;

/**
 * 发送短信工厂
 * Created by Yuanping on 2017/10/10.
 */
public class SendSmsFactory implements Provider {
    /**
     * 生产，创建短信发送实例
     * @return
     */
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
