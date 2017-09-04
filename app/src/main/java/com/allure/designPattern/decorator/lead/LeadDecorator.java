package com.allure.designPattern.decorator.lead;

/**
 * 抽象的装饰者
 * Created by Allure on 2017/9/4.
 */

public abstract class LeadDecorator implements LeadEuipment {

    Lead lead;

    public LeadDecorator(Lead lead) {
        this.lead = lead;
    }

    public  void arms(){
        lead.arms();
    }

    public  void boots(){
        lead.boots();
    }

    public  void trousers(){
        lead.trousers();
    }

    public  void helmet(){
        lead.helmet();
    }

    public  void clothes(){
        lead.clothes();
    }
}
