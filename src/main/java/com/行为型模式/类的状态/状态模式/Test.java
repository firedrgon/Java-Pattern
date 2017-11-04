package com.行为型模式.类的状态.状态模式;

/**
 * Created by Yuanping on 2017/11/3.
 */
public class Test {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
