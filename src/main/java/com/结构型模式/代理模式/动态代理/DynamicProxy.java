package com.结构型模式.代理模式.动态代理;

import java.lang.reflect.Proxy;

/**
 * Created by Yuanping on 2017/10/18.
 */
public class DynamicProxy {
    public static void main(String[] args) {
        //代理对象
        Subject subject = new RealSubject();
        //InvocationHandler,代理类的处理器类
        ProxyHandler handler = new ProxyHandler(subject);
        //获得代理对象
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);
        //通过代理对象调用方法
        proxyInstance.request();

    }
}
