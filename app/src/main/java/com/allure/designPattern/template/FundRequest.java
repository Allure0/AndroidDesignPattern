package com.allure.designPattern.template;

/**
 * 资金审核流程
 * Created by Allure on 2017/8/29.
 */

public class FundRequest implements Step {

    protected int auditAmount = 0;
    protected int actualAmount = 0;

    @Override
    public void stepOne() {
        System.out.print("\n" + "预备审核资金:" + String.valueOf(auditAmount));
    }

    @Override
    public void stepTwo() {
        System.out.print("\n" + "经理审核金额:" + String.valueOf(auditAmount));
    }

    @Override
    public void stepThree() {
        System.out.print("\n" + "经理审批金额:" + String.valueOf(actualAmount));
    }

    @Override
    public void stepFinish() {
        System.out.print("\n" + "审批允许的实际金额:" + String.valueOf(actualAmount));

    }


    //审核流程 不可更改
    public final void review() {
        if (auditAmount <= 0) {
            System.out.print("\n" + "请先调用StepOne添加预备审核资金");
            return;
        }
        System.out.println("\n" + "\n" + "------资金审核开始------");
        stepTwo();
        stepThree();
        stepFinish();
        System.out.println("\n" + "\n" + "------资金审核结束-------");
    }

}
