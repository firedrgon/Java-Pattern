package com.创建型模式.工厂方法模式;

/**
 * 工厂实现该接口，返回具体的实例对象
 * Created by Yuanping on 2017/10/10.
 */
public interface Provider {
    Sender produce();
}
