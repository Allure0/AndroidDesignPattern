package com.allure.designPattern.responsibilitychain.handle;

import com.allure.designPattern.responsibilitychain.CompanyLeader;
import com.allure.designPattern.responsibilitychain.CompanyRequest;
import com.allure.designPattern.responsibilitychain.TypeConfig;

/**
 * Created by Allure on 2017/8/14.
 */

public class HardHandle  extends CompanyLeader{
    @Override
    public int getType() {
        return TypeConfig.HARD;
    }

    @Override
    public void handle(CompanyRequest type) {
        System.out.println("高等难度请求");
    }
}
