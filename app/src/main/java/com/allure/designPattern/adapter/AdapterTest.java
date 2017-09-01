package com.allure.designPattern.adapter;

/**
 * Created by Allure on 2017/9/1.
 */

public  class AdapterTest {
    public static void main(String[] args) {

        //类适配器
        Voltage voltage=new Voltage220();
        voltage.getVoltage();

        Voltage voltage1=new PowerAdapter();
        voltage1.getVoltage();


        //对象适配器
        Voltage voltage2=new Voltage220();
        voltage2.getVoltage();

        Voltage100 voltage3=new Voltage100();
        Voltage voltage4=new AbstractPowerAdapter(voltage3);
        voltage4.getVoltage();
    }
}
