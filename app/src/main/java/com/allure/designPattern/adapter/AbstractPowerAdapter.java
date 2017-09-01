package com.allure.designPattern.adapter;

/**
 * Created by Allure on 2017/9/1.
 */

public class AbstractPowerAdapter implements  Voltage {

    //适配类为100V电压
    private  Voltage100 voltage100;

    public AbstractPowerAdapter(Voltage100 voltage100) {
        this.voltage100 = voltage100;
    }

    @Override
    public void getVoltage() {
        voltage100.getVoltage100();
    }
}
