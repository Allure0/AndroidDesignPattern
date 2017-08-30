package com.allure.designPattern.mediator;

/**
 * Created by Allure on 2017/8/30.
 */

public class StudentB extends Student {

    public StudentB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doSomeThings() {
        System.out.print("\n" + "通知:StudetB负责B项目");
    }
}
