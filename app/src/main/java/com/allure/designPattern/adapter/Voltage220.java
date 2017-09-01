package com.allure.designPattern.adapter;

/**
 * 一般产品需要220电压
 * Created by Allure on 2017/9/1.
 */

public class Voltage220 implements Voltage {
    @Override
    public void getVoltage() {
        System.out.print("\n"+"正常物件A:获取220的电压");
    }
}
