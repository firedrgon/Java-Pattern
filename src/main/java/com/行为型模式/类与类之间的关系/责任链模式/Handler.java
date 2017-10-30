package com.行为型模式.类与类之间的关系.责任链模式;

/**
 * Created by Yuanping on 2017/10/29.
 */
public abstract class Handler {
    /**
     * 持有后继的责任对象
     */
    protected Handler successor;

    /**
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数的，但实际是可以传入参数的，更具具体需要来选择
     */
    public abstract void handleRequest();

    /**
     * 取值方法
     * @return
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 赋值方法，设置后继的责任对象
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
