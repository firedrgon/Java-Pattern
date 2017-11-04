package com.行为型模式.类的状态.状态模式;

/**
 * Created by Yuanping on 2017/11/3.
 * 状态模式的切换类
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //不同状态执行不同逻辑
    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
