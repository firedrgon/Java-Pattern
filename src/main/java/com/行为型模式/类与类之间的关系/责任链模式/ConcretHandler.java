package com.行为型模式.类与类之间的关系.责任链模式;

/**
 * Created by Yuanping on 2017/10/29.
 */
public class ConcretHandler extends Handler {
    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        /**
         * 判断是否有后继的责任对象，如果有，就转发请求给后继的责任对象，如果没有，则处理请求
         */
        if (getSuccessor() != null) {
            System.out.println("放过此请求");
            getSuccessor().handleRequest();
        } else {
            System.out.println("处理请求");
        }
    }
}






















