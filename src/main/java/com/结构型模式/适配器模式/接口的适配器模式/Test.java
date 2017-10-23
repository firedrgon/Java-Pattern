package com.结构型模式.适配器模式.接口的适配器模式;

/**
 * Created by Yuanping on 2017/10/15.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source = new SourceSub1();
        source.method1();
        source.method2();

        Sourceable sourceable = new SourceSub2();
        sourceable.method1();
        sourceable.method2();
    }
}
