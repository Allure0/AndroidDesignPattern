package com.allure.designPattern.responsibilitychain.request;

import com.allure.designPattern.responsibilitychain.CompanyRequest;
import com.allure.designPattern.responsibilitychain.TypeConfig;

/**
 * Created by Allure on 2017/8/14.
 */

public class HardRequest extends CompanyRequest {

    public HardRequest(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestType() {
        return TypeConfig.HARD;
    }
}
