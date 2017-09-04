package com.allure.designPattern.decorator.arms;

import com.allure.designPattern.decorator.lead.Lead;
import com.allure.designPattern.decorator.lead.LeadDecorator;

/**
 * 被装饰者-主角武器
 * Created by Allure on 2017/9/4.
 */

public class LeadArms extends LeadDecorator implements Arms {


    public LeadArms(Lead lead) {
        super(lead);
    }

    @Override
    public void arms() {
//        super.arms();
//        System.out.println("配置武器:剑");
        armsType();
        armsColor();
    }


    @Override
    public void armsType() {
        System.out.println("默认武器:剑");
    }

    @Override
    public void armsColor() {
        System.out.println("默认武器颜色:白色");
    }
}
