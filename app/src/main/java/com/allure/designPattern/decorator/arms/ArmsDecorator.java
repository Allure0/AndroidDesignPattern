package com.allure.designPattern.decorator.arms;

import com.allure.designPattern.decorator.lead.LeadDecorator;
import com.allure.designPattern.decorator.lead.LeadEuipment;

/**
 * 武器
 * Created by Allure on 2017/9/4.
 */

public class ArmsDecorator implements LeadDecorator {

private LeadEuipment  leadEuipment;

    public ArmsDecorator(LeadEuipment leadEuipment) {
        this.leadEuipment = leadEuipment;
    }

    @Override
    public String  equip() {

        return leadEuipment.equip()+"+武器";
    }


}
