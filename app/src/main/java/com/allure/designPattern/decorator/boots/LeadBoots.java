package com.allure.designPattern.decorator.boots;

import com.allure.designPattern.decorator.lead.Lead;
import com.allure.designPattern.decorator.lead.LeadDecorator;

/**
 * Created by Allure on 2017/9/4.
 */

public class LeadBoots extends LeadDecorator {

    public LeadBoots(Lead lead) {
        super(lead);
    }
}
