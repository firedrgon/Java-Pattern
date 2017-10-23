package com.结构型模式.代理模式.动态代理;

/**
 * Created by Yuanping on 2017/10/18.
 * 真实对象
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("=== RealSubject Request ===");
    }
}
