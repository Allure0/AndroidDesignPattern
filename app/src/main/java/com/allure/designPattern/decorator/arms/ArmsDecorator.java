package com.allure.designPattern.decorator.arms;

import com.allure.designPattern.decorator.lead.Lead;

/**
 * 抽象的武器装饰器，持有一个被装饰者的引用：
 * Created by Allure on 2017/9/4.
 */

public abstract class ArmsDecorator extends LeadArms {


    public ArmsDecorator(Lead lead) {
        super(lead);
    }
}
