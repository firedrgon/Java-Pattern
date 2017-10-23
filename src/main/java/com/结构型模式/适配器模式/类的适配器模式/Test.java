package com.结构型模式.适配器模式.类的适配器模式;

/**
 * Created by Yuanping on 2017/10/15.
 */
public class Test {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();

        /**
         * 这样Targetable接口的实现类就具有了Source类的功能
         */
    }
}
