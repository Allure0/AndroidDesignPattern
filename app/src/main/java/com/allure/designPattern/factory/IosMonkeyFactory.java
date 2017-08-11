package com.allure.designPattern.factory;

/**
 * Created by Allure on 2017/8/11.
 */

public class IosMonkeyFactory extends Factory {
    @Override
    public CodeMonkey showCodeMonkeyType() {
        return new IosCodeMonkey();
    }
}
