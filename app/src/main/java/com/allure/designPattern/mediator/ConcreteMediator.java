package com.allure.designPattern.mediator;

/**
 * 具体的中介
 * Created by Allure on 2017/8/30.
 */

public class ConcreteMediator implements Mediator {

    private  StudentA studentA;
    private  StudentB studentB;

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }

    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }

    @Override
    public void doSomeThings() {
        studentA.doSomeThings();
        studentB.doSomeThings();
    }
}
