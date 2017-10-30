package com.行为型模式.类与类之间的关系.迭代子模式;

/**
 * Created by Yuanping on 2017/10/27.
 */
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
