package com.allure.designPattern.decorator.arms;

import com.allure.designPattern.decorator.lead.Lead;

/**
 * 扩展类 刀类武器
 * Created by Allure on 2017/9/4.
 */

public class RedArms extends ArmsDecorator {


    public RedArms(Lead lead) {
        super(lead);
    }

    @Override
    public void arms() {
        super.arms();
    }
    @Override
    public void armsType() {
        System.out.print("红色武器+");
    }

    @Override
    public void armsColor() {
        super.armsColor();
    }
}
