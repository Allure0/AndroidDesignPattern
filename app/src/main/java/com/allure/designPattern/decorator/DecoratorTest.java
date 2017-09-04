package com.allure.designPattern.decorator;

import com.allure.designPattern.decorator.arms.ArmsDecorator;
import com.allure.designPattern.decorator.boots.BootsDecorator;
import com.allure.designPattern.decorator.lead.Lead;

/**
 * Created by Allure on 2017/9/4.
 */

public class DecoratorTest {

    public static void main(String[] args) {

        //默认配置
        Lead lead=new Lead();
        System.out.println("角色装备的装备:"+lead.equip());


        //给角色装饰靴子和武器
        ArmsDecorator armsDecorator=new ArmsDecorator(lead);
        BootsDecorator bootsDecorator=new BootsDecorator(armsDecorator);
        bootsDecorator.equip();
        System.out.println("角色装备的装备:"+bootsDecorator.equip());




    }
}
