package com.结构型模式.装饰模式;

/**
 * Created by Yuanping on 2017/10/17.
 * 装饰类,拥有被装饰类Source的实例
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    /**
     * 在执行被装饰类方法之前和之后，执行一些其他代码逻辑
     */
    @Override
    public void method() {
        System.out.println("在执行被装饰类的方法之前，执行其他的代码。。。");
        source.method();
        System.out.println("在执行被装饰类的方法之后，执行其他的代码。。。");
    }
}
