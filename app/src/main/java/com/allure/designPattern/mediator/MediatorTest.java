package com.allure.designPattern.mediator;

/**
 * Created by Allure on 2017/8/30.
 */

public class MediatorTest {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.setStudentA(new StudentA(concreteMediator));
        concreteMediator.setStudentB(new StudentB(concreteMediator));
        concreteMediator.doSomeThings();
    }
}
