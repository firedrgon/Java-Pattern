package com.行为型模式.父类与子类关系.模板方法模式;

/**
 * Created by Yuanping on 2017/10/25.
 */
public class Test {
    public static void main(String[] args) {
        String exp = "8+8";

        AbstractCalculator cal = new Plus();

        int result = cal.calculate(exp, "\\+");

        System.out.println(result);
    }
}
