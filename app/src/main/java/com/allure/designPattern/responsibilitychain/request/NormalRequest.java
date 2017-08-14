package com.allure.designPattern.responsibilitychain.request;

import com.allure.designPattern.responsibilitychain.CompanyRequest;
import com.allure.designPattern.responsibilitychain.TypeConfig;

/**
 * 普通难度决策
 * Created by Allure on 2017/8/14.
 */

public class NormalRequest extends CompanyRequest {
    public NormalRequest(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestType() {
        return TypeConfig.NORMAL;
    }
}
