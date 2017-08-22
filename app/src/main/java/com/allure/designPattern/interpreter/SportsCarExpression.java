package com.allure.designPattern.interpreter;

/**
 * 跑车
 * Created by Allure on 2017/8/22.
 */

public class SportsCarExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public SportsCarExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
    }

    @Override
    public boolean interpret(String string) {
        //这里的||属于对解释器模式进行一个及时
        return expr1.interpret(string) || expr2.interpret(string);
    }
}
