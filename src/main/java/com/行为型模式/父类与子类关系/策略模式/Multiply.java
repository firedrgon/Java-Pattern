package com.行为型模式.父类与子类关系.策略模式;

/**
 * Created by Yuanping on 2017/10/24.
 * 数值相乘
 */
public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }
}
