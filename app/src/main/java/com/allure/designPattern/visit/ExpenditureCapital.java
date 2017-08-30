package com.allure.designPattern.visit;

/**
 * 资金支出状况
 * Created by Allure on 2017/8/30.
 */

public class ExpenditureCapital implements Capital {

    private String status;//订单的标记 支出还是收入
    private double price;//金钱


    public ExpenditureCapital() {

    }

    public ExpenditureCapital(String status, double price) {
        this.status = status;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.readExpenditureCapital(this);
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
