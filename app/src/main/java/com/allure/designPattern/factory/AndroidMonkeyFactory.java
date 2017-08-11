package com.allure.designPattern.factory;

/**
 * Created by Allure on 2017/8/11.
 */

public class AndroidMonkeyFactory extends Factory {

    @Override
    public CodeMonkey showCodeMonkeyType() {
        return new AndroidCodeMonkey();
    }
}
