package com.行为型模式.类与类之间的关系.迭代子模式;

/**
 * Created by Yuanping on 2017/10/27.
 * 定义集合操作的接口方法
 */
public interface Collection {
    //集合数据的其他操作，交给Iterator实现类解决
    public Iterator iterator();

    //取得集合元素
    public Object get(int i);
    //取的集合大小
    public int sieze();
}
