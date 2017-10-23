package com.结构型模式.代理模式.静态代理;

/**
 * Created by Yuanping on 2017/10/18.
 * 代理类
 */
public class Proxy implements Sourceable {
    private Sourceable source;

    //拥有 被代理类的实例
    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void method() {
        //被代理方法执行之前，执行其他操作
        before();
        source.method();
        //被代理方法执行之后，执行其他操作
        atfer();
    }

    private void atfer() {
        System.out.println("被代理类方法执行之前，执行的方法...");
    }

    private void before() {
        System.out.println("被代理类方法执行之后，执行的方法...");
    }
}
