package com.allure.designPattern.mediator;

/**
 * Created by Allure on 2017/8/30.
 */

public abstract class Student {

    public Mediator mediator;

    public Student(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void doSomeThings();

}
