package com.allure.designPattern.interpreter;

/**
 * Created by Allure on 2017/8/22.
 */

public class InterpreterTest {
    public static void main(String[] args) {
        // 保时捷911和奥迪R8都属于跑车
        Expression carExpression = new CarExpression("奥迪R8");
        Expression carExpression1 = new CarExpression("保时捷911");
        Expression sportsCarExpression=new SportsCarExpression(carExpression,carExpression1);

        //奥迪R8是否是跑车
        System.out.print("解释结果:"+sportsCarExpression.interpret("奥迪R8")+"\n");


        Expression carExpressio3 = new CarExpression("奔驰GLK");
        Expression carExpressio4 = new CarExpression("SUV");
        Expression benZSUVExpression = new BenZSUVExpression(carExpressio3, carExpressio4);
        //奔驰GLK是否属于奔驰系列的SUV
        System.out.print("解释结果:"+benZSUVExpression.interpret("奔驰GLKSUV")+"\n");
        //宝马5系是否属于奔驰SUV
        System.out.print("解释结果:"+benZSUVExpression.interpret("宝马X5")+"\n");

    }
}
