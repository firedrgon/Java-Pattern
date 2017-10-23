package com.结构型模式.适配器模式.对象的适配器模式;

/**
 * Created by Yuanping on 2017/10/15.
 * 不继承Source类，而是持有Source类的实例
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("这是目标的另一个方法。。。");
    }
}
