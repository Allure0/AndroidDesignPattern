package com.allure.designPattern.decorator.boots;

import com.allure.designPattern.decorator.lead.LeadDecorator;
import com.allure.designPattern.decorator.lead.LeadEuipment;

/**
 * Created by Allure on 2017/9/4.
 */

public class BootsDecorator implements LeadDecorator {

    private  LeadEuipment leadEuipment;

    public BootsDecorator(LeadEuipment leadEuipment) {
        this.leadEuipment = leadEuipment;
    }

    @Override
    public String equip() {
        return leadEuipment.equip()+"+靴子";
    }
}
