package com.allure.designPattern.visit;

/**
 * 财务访问每一个订单的资金收支
 * Created by Allure on 2017/8/30.
 */

public class FinanceVisitor implements Visitor {

    private  int position;//第几个订单

    @Override
    public void readIncomeCapital(IncomeCapital incomeCapital) {
        position++;
        if(incomeCapital.getStatus().equals(VisitConfig.INCOME)){
            System.out.println("\n"+"第" + position + "个订单收入:" + incomeCapital.getPrice());
        }
    }

    @Override
    public void readExpenditureCapital(ExpenditureCapital expenditureCapital) {
        if(expenditureCapital.getStatus().equals(VisitConfig.EXPENDITUR)){
            System.out.println("\n"+"第" + position + "个订单支出:" + expenditureCapital.getPrice());
        }
    }
}
