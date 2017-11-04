package com.行为型模式.通过中间类.访问者模式;

/**
 * Created by Yuanping on 2017/11/4.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject:" + subject.getSubject());
    }
}
