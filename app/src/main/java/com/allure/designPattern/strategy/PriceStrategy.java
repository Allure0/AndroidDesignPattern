package com.allure.designPattern.strategy;

/**
 * 策略模式接口  如Android中的ListView的Adapter  动画中的TimeInterpolator使用策略模式
 * 价格接口
 * Created by Allure on 2017/8/14.
 */

public interface PriceStrategy {
    Double  setPrice(int price);
}
