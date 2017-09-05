package com.allure.designPattern.bridge.person;

import com.allure.designPattern.bridge.flavor.Flavor;

/**
 * 抽象角色---青年人
 * Created by Allure on 2017/9/5.
 */

public class YouthPerson extends Person {


    public YouthPerson(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void personTypeAndFlavor() {
        System.out.print("青年人+");
        flavor.flavor();
    }
}
