package com.行为型模式.类与类之间的关系.迭代子模式;

/**
 * Created by Yuanping on 2017/10/27.
 */
public class MyCollection implements Collection {
    //声明数组集合
    public String string[] = { "A", "B", "C", "D", "E" };
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int sieze() {
        return string.length;
    }
}
