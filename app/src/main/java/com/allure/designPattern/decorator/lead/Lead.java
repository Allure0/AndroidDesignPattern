package com.allure.designPattern.decorator.lead;

/**
 * 被装饰者----主角
 * Created by Allure on 2017/9/4.
 */

public class Lead implements LeadEuipment {


    public void arms() {
        System.out.println("默认武器");
    }

    public void boots() {
        System.out.println("默认靴子");
    }

    public void clothes() {
        System.out.println("默认上衣");
    }

    public void helmet() {
        System.out.println("默认头盔");
    }

    public void trousers() {
        System.out.println("默认下装");
    }
}
