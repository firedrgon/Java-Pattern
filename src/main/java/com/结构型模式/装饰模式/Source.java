package com.结构型模式.装饰模式;

/**
 * Created by Yuanping on 2017/10/17.
 * 被装饰类，实现Sourceable接口
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("执行被装饰的方法。。。。");
    }
}
