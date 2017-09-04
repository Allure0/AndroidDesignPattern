package com.allure.designPattern.decorator.arms;

import com.allure.designPattern.decorator.lead.Lead;

/**
 * 刀类武器
 * Created by Allure on 2017/9/4.
 */

public class BlackDefaultArms extends ArmsDecorator {

    public BlackDefaultArms(Lead lead) {
        super(lead);
    }


    @Override
    public void armsColor() {
        System.out.println("武器颜色:黑色");
    }
}
