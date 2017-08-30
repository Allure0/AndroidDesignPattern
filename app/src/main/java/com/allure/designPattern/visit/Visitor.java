package com.allure.designPattern.visit;

/**
 * Created by Allure on 2017/8/30.
 */

public interface Visitor {
    //查看收入
    void readIncomeCapital(IncomeCapital incomeCapital);
    //查看支出
    void readExpenditureCapital(ExpenditureCapital expenditureCapital);
}
