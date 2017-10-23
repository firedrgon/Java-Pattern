package com.创建型模式.工厂方法模式.简单工程模式.多个工厂方法模式;

/**
 * Created by Yuanping on 2017/10/10.
 */
public class Test {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender sender = factory.produceSms();//发送短信实例

        //调用实例方法
        sender.send();
    }

     /*
     * 【多个工厂方法模式】与 【普通工厂方法模式】的比较，优点在于：
     *
     * 1、无须手动输入参数创建实例对象
     * 2、避免了参数输入错误，导致实例创建失败，系统出错。
     * 3、直接调用方法即可创建实例对象
     * 4、 需要哪些实例，只需要在工厂中声明方法
     * 5、不会出现其他未从出现的实例对象
     * 6、...
     *
     * */
}
