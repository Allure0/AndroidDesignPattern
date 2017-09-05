package com.allure.designPattern.bridge.flavor;

/**
 * 具体实现——--麻辣味
 * Created by Allure on 2017/9/5.
 */

public class SpicyFlavor implements  Flavor {
    @Override
    public void flavor() {
        System.out.println("Flavor:麻辣味");
    }
}
