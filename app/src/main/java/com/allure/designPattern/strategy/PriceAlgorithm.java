package com.allure.designPattern.strategy;

/**
 * Created by Allure on 2017/8/14.
 */

public class PriceAlgorithm {
    private PriceStrategy priceStrategy;


    public PriceStrategy getPriceStrategy() {
        return priceStrategy;
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public int getPrice(int price) {
        if(priceStrategy!=null){
            return priceStrategy.setPrice(price);
        }
        return 0;
    }
}
