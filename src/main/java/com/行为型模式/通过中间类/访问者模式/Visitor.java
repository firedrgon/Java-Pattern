package com.行为型模式.通过中间类.访问者模式;

/**
 * Created by Yuanping on 2017/11/4.
 * 存放要访问的对象
 */
public interface Visitor {
    public void visit(Subject subject);
}
