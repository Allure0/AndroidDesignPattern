package com.allure.designPattern.strategy;

/**
 * 半价方法
 * Created by Allure on 2017/8/14.
 */

public class HalfPriceStrategy implements PriceStrategy {

    @Override
    public Double setPrice(int price) {
        return 0.5 * price;
    }
}
