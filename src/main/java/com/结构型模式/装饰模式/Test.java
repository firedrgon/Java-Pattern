package com.结构型模式.装饰模式;

/**
 * Created by Yuanping on 2017/10/17.
 */
public class Test {
    public static void main(String[] args) {
        //被装饰的对象
        Sourceable source = new Source();

        //将被装饰类对象传递给装饰类，由装饰类发起方法调用，在执行方法的前后加入其他业务逻辑代码
        Sourceable decorator = new Decorator(source);

        //执行被装饰类的方法
        decorator.method();

    }

}
