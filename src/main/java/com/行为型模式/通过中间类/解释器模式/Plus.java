package com.行为型模式.通过中间类.解释器模式;

/**
 * Created by Yuanping on 2017/11/5.
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
