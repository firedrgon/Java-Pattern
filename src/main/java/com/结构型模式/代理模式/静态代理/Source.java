package com.结构型模式.代理模式.静态代理;

/**
 * Created by Yuanping on 2017/10/18.
 * 被代理类，实现Sourceable
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("执行被代理类的方法");
    }
}
