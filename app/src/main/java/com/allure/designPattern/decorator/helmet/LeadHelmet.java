package com.allure.designPattern.decorator.helmet;

import com.allure.designPattern.decorator.lead.Lead;
import com.allure.designPattern.decorator.lead.LeadDecorator;

/**
 * Created by Allure on 2017/9/4.
 */

public class LeadHelmet  extends LeadDecorator {

    public LeadHelmet(Lead lead) {
        super(lead);
    }
}
