package com.结构型模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Yuanping on 2017/10/18.
 * 实现InvocationHandler
 */
public class ProxyHandler implements InvocationHandler {
    private Subject subject;

    public ProxyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理之前，执行其他操作
        System.out.println("=== before ====");
        Object result = method.invoke(subject, args);
        //代理之后，执行其他操作
        System.out.println("=== after ===");
        return result;
    }
}




























