package com.allure.designPattern.decorator.arms;

import com.allure.designPattern.decorator.lead.Lead;

/**
 * 扩展类 刀类武器
 * Created by Allure on 2017/9/4.
 */

public class RedDefaultArms extends ArmsDecorator {


    public RedDefaultArms(Lead lead) {
        super(lead);
    }

    @Override
    public void arms() {
        super.arms();
    }

    @Override
    public void armsColor() {
        System.out.println("武器颜色:红色");
    }

    @Override
    public void armsType() {
        System.out.println("更改武器:刀");
    }
}
