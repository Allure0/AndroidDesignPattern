package com.allure.designPattern.strategy;

/**
 * Created by Allure on 2017/8/14.
 */

public class seventPriceStrategy implements PriceStrategy {
    @Override
    public Double setPrice(int price) {
        return 0.7 * price;
    }
}
