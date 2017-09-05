package com.allure.designPattern.bridge.person;

import com.allure.designPattern.bridge.flavor.Flavor;

/**
 * 抽象角色——-老年人
 * Created by Allure on 2017/9/5.
 */

public class OldPerson extends Person {



    public OldPerson(Flavor flavor) {
        super(flavor);
    }

    @Override
    public void personTypeAndFlavor() {
        System.out.print("老年人+");
        flavor.flavor();
    }
}
