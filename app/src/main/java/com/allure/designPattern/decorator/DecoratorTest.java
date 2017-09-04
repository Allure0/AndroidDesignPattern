package com.allure.designPattern.decorator;

import com.allure.designPattern.decorator.arms.ArmsDecorator;
import com.allure.designPattern.decorator.arms.RedDefaultArms;
import com.allure.designPattern.decorator.lead.Lead;

/**
 * Created by Allure on 2017/9/4.
 */

public class DecoratorTest {

    public static void main(String[] args) {

//        //默认配置:不装饰任何东西
//        Lead leadEuipment= new Lead();//人物
//        System.out.println("人物配装为:");
//        leadEuipment.arms();
//        leadEuipment.trousers();
//        leadEuipment.helmet();
//        leadEuipment.boots();
//        leadEuipment.clothes();


//        //装饰剑类武器
//        Lead leadEuipment1= new Lead();//人物
//        LeadDecorator leadDecorator=new LeadArms(leadEuipment1);
//        System.out.println("人物配装为:");
//        leadDecorator.arms();
//        leadDecorator.trousers();
//        leadDecorator.helmet();
//        leadDecorator.boots();
//        leadDecorator.clothes();


        //装饰红色武器
        Lead leadEuipment2= new Lead();//人物
        ArmsDecorator armsDecorator=new RedDefaultArms(leadEuipment2);
        System.out.println("人物配装为:");
        armsDecorator.arms();
        armsDecorator.trousers();
        armsDecorator.helmet();
        armsDecorator.boots();
        armsDecorator.clothes();



    }
}
