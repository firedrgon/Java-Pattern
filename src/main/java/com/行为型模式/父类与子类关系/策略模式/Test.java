package com.行为型模式.父类与子类关系.策略模式;

/**
 * Created by Yuanping on 2017/10/24.
 *
 */
public class Test {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator calculator = new Plus();
        int calculate = calculator.calculate(exp);
        System.out.println(calculate);

        /**
         * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
         * 因此，策略模式多用在算法决策系统中，外部用户只需要决定用那个算法即可
         */
    }
}









































