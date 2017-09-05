package com.allure.designPattern.bridge.flavor;

/**
 * Created by Allure on 2017/9/5.
 */

public class LightFlavor implements Flavor {
    @Override
    public void flavor() {
        System.out.println("Flavor:清淡味");
    }
}
