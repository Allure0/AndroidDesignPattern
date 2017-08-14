package com.allure.designPattern.strategy;

/**
 * 半价方法
 * Created by Allure on 2017/8/14.
 */

public class HalfPriceStrategy implements  PriceStrategy {

    @Override
    public int setPrice(int price) {
        System.out.print("半价接口算法");
        return (int) (0.5*price);
    }
}
