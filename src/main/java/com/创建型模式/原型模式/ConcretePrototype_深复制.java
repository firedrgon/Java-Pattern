package com.创建型模式.原型模式;

/**
 * Created by Yuanping on 2017/10/8.
 */
public class ConcretePrototype_深复制 extends Prototype_深复制 {
    private static final long serialVersionUID = 1L;

    public ConcretePrototype_深复制(String name,String sexName) {
        setName(name);
        setObj(new SerializableObject(sexName));
    }
}
