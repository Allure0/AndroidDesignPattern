package com.allure.designPattern.strategy;

/**
 * Created by Allure on 2017/8/18.
 */

public class StrategyTest {
    public static void main(String[] args) {
        PriceAlgorithm priceAlgorithm = new PriceAlgorithm();
        priceAlgorithm.setPriceStrategy(new HalfPriceStrategy());
        System.out.print("\n" + "1块钱" + "5折后的价格:" + String.valueOf(priceAlgorithm.getPrice(1)));


        PriceAlgorithm priceAlgorithm2 = new PriceAlgorithm();
        priceAlgorithm2.setPriceStrategy(new seventPriceStrategy());
        System.out.print("\n" + "2块钱" + "7折后的价格:" + String.valueOf(priceAlgorithm2.getPrice(2)));

    }
}
