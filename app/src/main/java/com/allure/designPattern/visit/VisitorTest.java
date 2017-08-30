package com.allure.designPattern.visit;

/**
 * Created by Allure on 2017/8/30.
 */

public class VisitorTest {
    public static void main(String[] args) {

        //第一单
        IncomeCapital capital1=new IncomeCapital(VisitConfig.INCOME,1000);//收入1000
        ExpenditureCapital capital2=new ExpenditureCapital(VisitConfig.EXPENDITUR,1000);//支出1000

        //第二单
        IncomeCapital capital3=new IncomeCapital(VisitConfig.INCOME,5000);//收入1000
        ExpenditureCapital capital4=new ExpenditureCapital(VisitConfig.EXPENDITUR,1000);//支出1000

        //添加账单
        CapitalNote capitalNote=new CapitalNote();
        capitalNote.add(capital1);
        capitalNote.add(capital2);
        capitalNote.add(capital3);
        capitalNote.add(capital4);

        //财务和BOSS访问
        BossVistor bossVistor=new BossVistor();
        FinanceVisitor financeVisitor=new FinanceVisitor();

        capitalNote.acceptVistor(bossVistor);
        capitalNote.acceptVistor(financeVisitor);

        //总消费状态
        bossVistor.showIncomeCapital();
        bossVistor.showExpenditureCapital();

    }
}
