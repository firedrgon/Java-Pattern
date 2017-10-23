package com.创建型模式.原型模式;

import java.io.*;

/**
 * Created by Yuanping on 2017/10/8.
 */
public class Prototype_深复制 implements Cloneable,Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private SerializableObject obj;

    //此方法为深复制
    public Object deepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生新的对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sex;//性别名称

    //构造方法
    public SerializableObject(String type) {
        setSex(type);
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

}