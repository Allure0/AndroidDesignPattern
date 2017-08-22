package com.allure.designPattern.interpreter;

/**
 * Created by Allure on 2017/8/22.
 */

public class CarExpression implements Expression {

    private String data;

    public CarExpression(String data) {
        this.data = data;
    }


    @Override
    public boolean interpret(String string) {
        if (string.contains(data)) {
            return true;
        } else
            return false;
    }
}
