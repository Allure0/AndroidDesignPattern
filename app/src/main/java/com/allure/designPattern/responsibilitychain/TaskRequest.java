package com.allure.designPattern.responsibilitychain;

/**
 * 请求者
 * 抽象的请求type
 * Created by Allure on 2017/8/14.
 */

public abstract class TaskRequest {
    private Object obj;


    public TaskRequest(Object obj) {
        this.obj = obj;
    }

    public TaskRequest() {
    }
    public Object getContent() {
        return obj;
    }

    public abstract int getRequestType();


}
