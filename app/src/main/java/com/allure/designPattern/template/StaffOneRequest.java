package com.allure.designPattern.template;

/**
 * Created by Allure on 2017/8/29.
 */

public class StaffOneRequest extends FundRequest {


    public StaffOneRequest(int auditAmount,int actualAmount) {
        this.auditAmount = auditAmount;
        this.actualAmount = actualAmount;
    }

    @Override
    public void stepOne() {
        super.stepOne();
    }

    @Override
    public void stepTwo() {
        super.stepTwo();
    }

    @Override
    public void stepThree() {
        super.stepThree();
    }

    @Override
    public void stepFinish() {
        super.stepFinish();
    }
}
