package com.allure.designPattern.decorator.clothes;

import com.allure.designPattern.decorator.lead.LeadDecorator;
import com.allure.designPattern.decorator.lead.LeadEuipment;

/**
 * Created by Allure on 2017/9/4.
 */

public class ClothesDecorator implements LeadDecorator {


    private  LeadEuipment leadEuipment;

    public ClothesDecorator(LeadEuipment leadEuipment) {
        this.leadEuipment = leadEuipment;
    }

    @Override
    public String equip() {
        return leadEuipment.equip()+"+上衣";
    }
}
