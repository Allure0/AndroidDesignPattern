package com.allure.designPattern.adapter;

/**
 * 电源适配器
 * Created by Allure on 2017/9/1.
 */

public class PowerAdapter extends Voltage100 implements Voltage{
    @Override
    public void getVoltage() {
        super.getVoltage100();
    }
}
