package com.allure.designPattern.visit;

/**
 * BOSS访问总体资金的收支
 * Created by Allure on 2017/8/30.
 */

public class BossVistor implements  Visitor {

    private  double totalIncomeCapital;//总收入
    private  double totalExpenditureCapital;//总支出



    @Override
    public void readIncomeCapital(IncomeCapital incomeCapital) {
        totalIncomeCapital=totalIncomeCapital+incomeCapital.getPrice();
    }

    @Override
    public void readExpenditureCapital(ExpenditureCapital expenditureCapital) {
        totalExpenditureCapital=totalExpenditureCapital+expenditureCapital.getPrice();
    }

    public void showIncomeCapital(){
        System.out.print("\n"+"一共收入资金:"+totalIncomeCapital);
    }

    public void showExpenditureCapital(){
        System.out.print("\n"+"一共支出资金:"+totalExpenditureCapital);
    }
}
