package com.allure.designPattern.responsibilitychain;

/**
 * 请求者
 * 抽象的请求type
 * Created by Allure on 2017/8/14.
 */

public abstract class CompanyRequest {
    private Object obj;

    public CompanyRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent() {
        return obj;
    }

    public abstract int getRequestType();


}
