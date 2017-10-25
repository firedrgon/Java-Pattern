package com.行为型模式.父类与子类关系.模板方法模式;

/**
 * Created by Yuanping on 2017/10/25.
 * 在AbstractCalculator类中定义一个主方法calculate,calculate()调用spilt()等，
 * Plus继承AbstractCalculator
 */
public abstract class AbstractCalculator {
    /**
     * 主方法，实现对本类其他方法的调用
     * @param exp
     * @param opt
     * @return
     */
    public final int calculate(String exp, String opt) {
        int array[] = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    /**
     * 被子类重写的方法
     * @param num1
     * @param num2
     * @return
     */
    abstract public int calculate(int num1, int num2);

    //解析获取数值
    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
