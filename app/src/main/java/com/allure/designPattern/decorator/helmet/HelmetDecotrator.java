package com.allure.designPattern.decorator.helmet;

import com.allure.designPattern.decorator.lead.LeadDecorator;
import com.allure.designPattern.decorator.lead.LeadEuipment;

/**
 * Created by Allure on 2017/9/4.
 */

public class HelmetDecotrator implements LeadDecorator {

private LeadEuipment leadEuipment;

    public HelmetDecotrator(LeadEuipment leadEuipment) {
        this.leadEuipment = leadEuipment;
    }

    @Override
    public String equip() {
        return leadEuipment.equip()+"+头盔";
    }
}
