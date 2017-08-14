package com.allure.designPattern.responsibilitychain.request;

import com.allure.designPattern.responsibilitychain.CompanyRequest;
import com.allure.designPattern.responsibilitychain.TypeConfig;

/**
 * 中等难度请求
 * Created by Allure on 2017/8/14.
 */

public class MiddleRequest extends CompanyRequest {

    public MiddleRequest(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestType() {
        return TypeConfig.MIDDEL;
    }
}
