package com.结构型模式.组合模式;

/**
 * Created by Yuanping on 2017/10/22.
 * 将多个对象组合在一起进行操作
 */
public class Test {
    public static void main(String[] args) {
        //树A,当作顶级节点
        Tree tree = new Tree("A");

        //节点B
        TreeNode nodeB = new TreeNode("B");
        //节点C
        TreeNode nodeC = new TreeNode("C");

        //节点C 作为节点B的子节点
        nodeB.add(nodeC);
        //将节点B加入到树中，作为树A的子节点
        tree.root.add(nodeB);

        //输出子节点名称
        System.out.println(nodeB.getChildren().nextElement().getName());
        System.out.println("构造树完成");
    }
}
