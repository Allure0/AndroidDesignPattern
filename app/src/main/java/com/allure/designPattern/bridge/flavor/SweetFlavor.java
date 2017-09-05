package com.allure.designPattern.bridge.flavor;

/**
 * 具体实现---甜味
 * Created by Allure on 2017/9/5.
 */

public class SweetFlavor implements  Flavor {
    @Override
    public void flavor() {
        System.out.println("Flavor:甜味");
    }
}
