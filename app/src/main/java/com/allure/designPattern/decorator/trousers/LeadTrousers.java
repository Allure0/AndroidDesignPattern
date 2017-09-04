package com.allure.designPattern.decorator.trousers;

import com.allure.designPattern.decorator.lead.Lead;
import com.allure.designPattern.decorator.lead.LeadDecorator;

/**
 * Created by Allure on 2017/9/4.
 */

public class LeadTrousers extends LeadDecorator {

    public LeadTrousers(Lead lead) {
        super(lead);
    }
}
