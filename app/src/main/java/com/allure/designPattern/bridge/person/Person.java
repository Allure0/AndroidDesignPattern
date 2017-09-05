package com.allure.designPattern.bridge.person;

import com.allure.designPattern.bridge.flavor.Flavor;

/**
 * 抽象Person
 * Created by Allure on 2017/9/5.
 */

public abstract class Person {
    protected Flavor flavor;

    public Person(Flavor flavor) {
        this.flavor = flavor;
    }

    public abstract void personTypeAndFlavor();//人物种类
}
