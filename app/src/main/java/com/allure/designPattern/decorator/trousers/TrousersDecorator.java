package com.allure.designPattern.decorator.trousers;

import com.allure.designPattern.decorator.lead.LeadDecorator;
import com.allure.designPattern.decorator.lead.LeadEuipment;

/**
 * Created by Allure on 2017/9/4.
 */

public class TrousersDecorator implements LeadDecorator {

    private  LeadEuipment leadEuipment;

    public TrousersDecorator(LeadEuipment leadEuipment) {
        this.leadEuipment = leadEuipment;
    }

    @Override
    public String equip() {
        return leadEuipment.equip()+"+下装";
    }
}
