package com.行为型模式.类与类之间的关系.观察者模式;

/**
 * Created by Yuanping on 2017/10/26.
 * 观察者实现该接口，通知的时候，分别调用不同观察者的update方法
 */
public interface Observer {
    public void update();
}
