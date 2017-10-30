package com.行为型模式.类与类之间的关系.责任链模式;

/**
 * Created by Yuanping on 2017/10/29.
 */
public class Test {
    public static void main(String[] args) {
        //组责任链
        Handler handler1 = new ConcretHandler();
        Handler handler2 = new ConcretHandler();
        //提交请求
        handler1.setSuccessor(handler2);

        handler1.handleRequest();
    }

    /**
     * 可以看出，客户端创建了两个处理者对象，并指定第一个处理者对象的下家是第二个处理对象，
     * 而第二个
     */
}
