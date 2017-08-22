package com.allure.designPattern.interpreter;

/**
 * Created by Allure on 2017/8/22.
 */

public class BenZSUVExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public BenZSUVExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        //这里的&&属于对奔驰SUV解释器的解释
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
