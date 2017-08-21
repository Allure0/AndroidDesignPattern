package com.allure.designPattern.responsibilitychain.request;

import com.allure.designPattern.responsibilitychain.TaskRequest;

/**
 * 中等难度请求
 * Created by Allure on 2017/8/14.
 */

public class MiddleRequest extends TaskRequest {

    public MiddleRequest(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestType() {
        return (int) getContent();
    }
}
