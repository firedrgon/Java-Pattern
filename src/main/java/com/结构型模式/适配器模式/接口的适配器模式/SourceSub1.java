package com.结构型模式.适配器模式.接口的适配器模式;

/**
 * Created by Yuanping on 2017/10/15.
 * 继承抽象类Wrapper2,间接实现Sourceable接口中的某个方法
 */
public class SourceSub1 extends Wrapper2 {
    /**
     * 只想实现Sourceable接口中的method1方法
     */
    @Override
    public void method1() {
        System.out.println("the sourceable interface's first Sub1!");
    }
}
