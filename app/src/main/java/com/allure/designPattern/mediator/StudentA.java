package com.allure.designPattern.mediator;

/**
 * Created by Allure on 2017/8/30.
 */

public class StudentA extends Student {

    public StudentA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doSomeThings() {
        System.out.print("\n" + "通知:StudenA负责A项目");
    }
}
