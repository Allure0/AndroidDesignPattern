package com.allure.designPattern.responsibilitychain;

/**
 * 处理者
 * 抽象的公司领导
 * 处理公司的事物
 * Created by Allure on 2017/8/14.
 */

public abstract class CompanyLeader {
    public CompanyLeader companyLeader;

    public abstract int getType();

    public abstract void handle(CompanyRequest type);


    public void handleRequest(CompanyRequest companyRequest) {
        if (companyRequest.getRequestType() == getType()) {
            handle(companyRequest);
        } else {
            if (companyLeader != null) {//交给下级处理
                companyLeader.handleRequest(companyRequest);
            } else {
                System.out.println("没有人能处理");
            }


        }

    }
}
