package com.allure.designPattern.factory;

/**
 * Created by Allure on 2017/8/11.
 */

public class AndroidCodeMonkey implements  CodeMonkey {
    @Override
    public void showCodeMonkeyType() {
        System.out.println("我是Android攻城狮");
    }
}
