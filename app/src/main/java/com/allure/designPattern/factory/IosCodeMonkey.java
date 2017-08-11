package com.allure.designPattern.factory;

/**
 * Created by Allure on 2017/8/11.
 */

public class IosCodeMonkey implements  CodeMonkey {
    @Override
    public void showCodeMonkeyType() {
        System.out.print("我是iOS攻城狮");
    }
}
