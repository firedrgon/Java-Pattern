package com.行为型模式.通过中间类.解释器模式;

/**
 * Created by Yuanping on 2017/11/4.
 * 计算的接口
 */
public interface Expression {
    public int interpret(Context context);
}
