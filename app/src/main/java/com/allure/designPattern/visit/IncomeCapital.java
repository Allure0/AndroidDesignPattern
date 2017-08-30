package com.allure.designPattern.visit;

/**
 * 资金收入状况
 * Created by Allure on 2017/8/30.
 */

public class IncomeCapital implements Capital {

    private String status;//订单的标记 支出还是收入
    private double price;//金钱


    public IncomeCapital() {
    }

    public IncomeCapital(String status, double price) {
        this.status = status;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.readIncomeCapital(this);

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
