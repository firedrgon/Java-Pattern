package com.结构型模式.适配器模式.接口的适配器模式;

/**
 * Created by Yuanping on 2017/10/15.
 */
public class SourceSub2 extends Wrapper2 {
    /**
     * 只想实现 Sourceable 接口中的 method2 方法。
     */
    @Override
    public void method2() {
        System.out.println("the sourceable interface's second Sub2!");
    }
}
