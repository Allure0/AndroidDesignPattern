package com.allure.designPattern.responsibilitychain;

/**
 * 处理者
 * <p>
 * Created by Allure on 2017/8/14.
 */

public abstract class TaskLeader {
    public TaskLeader companyLeader;

    public abstract int getType();

    public abstract void handle(TaskRequest type);


    public void handleRequest(TaskRequest companyRequest) {
        //请求者的状态与处理者的状态一致直接处理
        if (companyRequest.getRequestType() == getType()) {
            handle(companyRequest);
        } else {
            if (companyLeader != null) {//交给上级处理
                companyLeader.handleRequest(companyRequest);
            } else {
                System.out.println("没有人能处理");
            }


        }

    }
}
