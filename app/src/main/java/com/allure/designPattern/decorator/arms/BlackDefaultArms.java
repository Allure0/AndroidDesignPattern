package com.allure.designPattern.decorator.arms;

import com.allure.designPattern.decorator.lead.Lead;

/**
 * 刀类武器
 * Created by Allure on 2017/9/4.
 */

public class BlackArms extends ArmsDecorator {

    public BlackArms(Lead lead) {
        super(lead);
    }


    @Override
    public void armsType() {
        System.out.print("黑色武器+");
    }
}
