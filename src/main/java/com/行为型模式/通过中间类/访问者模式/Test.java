package com.行为型模式.通过中间类.访问者模式;

/**
 * Created by Yuanping on 2017/11/4.
 */
public class Test {
    public static void main(String[] args) {
        //创建接收对象
        Subject subject = new MySubject();
        //创建需要被访问的对象
        Visitor visitor = new MyVisitor();
        //接受将要访问它的对象
        subject.accept(visitor);
    }
}
