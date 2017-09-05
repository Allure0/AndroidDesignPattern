package com.allure.designPattern.bridge.person;

import com.allure.designPattern.bridge.flavor.Flavor;

/**
 * 抽象角色---中年人
 * Created by Allure on 2017/9/5.
 */

public class MiddlePerson extends Person {


    public MiddlePerson(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void personTypeAndFlavor() {
        System.out.print("中年人+");
        flavor.flavor();
    }
}
