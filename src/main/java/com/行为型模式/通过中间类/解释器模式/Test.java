package com.行为型模式.通过中间类.解释器模式;

/**
 * Created by Yuanping on 2017/11/5.
 */
public class Test {
    public static void main(String[] args) {
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
