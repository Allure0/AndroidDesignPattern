package com.allure.designPattern.strategy;

/**
 * Created by Allure on 2017/8/14.
 */

public class seventPriceStrategy implements  PriceStrategy {
    @Override
    public int setPrice(int price) {
        System.out.print("7折算法");
        return (int) (0.7*price);
    }
}
