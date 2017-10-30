package com.行为型模式.类的状态.备忘录模式;

/**
 * Created by Yuanping on 2017/10/30.
 */
public class Test {
    public static void main(String[] args) {
        //创建原始类
        Original original = new Original("hello");
        //创建备忘录，存储原始类的信息
        Storage storage = new Storage(original.createMemento());

        //修改原始类的状态
        System.out.println("初始化状态为:" + original.getValue());
        original.setValue("word");
        System.out.println("修改后的状态为:" + original.getValue());

        //恢复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为:" + original.getValue());
    }
}
