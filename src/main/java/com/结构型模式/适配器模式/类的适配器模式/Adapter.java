package com.结构型模式.适配器模式.类的适配器模式;

/**
 * Created by Yuanping on 2017/10/15.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("这是目标的另一个方法");
    }
}
