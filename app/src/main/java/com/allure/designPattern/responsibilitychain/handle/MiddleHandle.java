package com.allure.designPattern.responsibilitychain.handle;

import com.allure.designPattern.responsibilitychain.CompanyLeader;
import com.allure.designPattern.responsibilitychain.CompanyRequest;
import com.allure.designPattern.responsibilitychain.TypeConfig;

/**
 * Created by Allure on 2017/8/14.
 */

public class MiddleHandle extends CompanyLeader {
    @Override
    public int getType() {
        return TypeConfig.MIDDEL;
    }

    @Override
    public void handle(CompanyRequest type) {
        System.out.println("中等难度请求");

    }
}
