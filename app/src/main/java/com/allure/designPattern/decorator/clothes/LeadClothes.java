package com.allure.designPattern.decorator.clothes;

import com.allure.designPattern.decorator.lead.Lead;
import com.allure.designPattern.decorator.lead.LeadDecorator;

/**
 * Created by Allure on 2017/9/4.
 */

public class LeadClothes extends LeadDecorator {

    public LeadClothes(Lead lead) {
        super(lead);
    }
}
