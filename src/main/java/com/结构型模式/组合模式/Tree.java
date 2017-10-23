package com.结构型模式.组合模式;

/**
 * Created by Yuanping on 2017/10/22.
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }
}
