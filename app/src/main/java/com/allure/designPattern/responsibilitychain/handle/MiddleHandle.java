package com.allure.designPattern.responsibilitychain.handle;

import com.allure.designPattern.responsibilitychain.TaskLeader;
import com.allure.designPattern.responsibilitychain.TaskRequest;
import com.allure.designPattern.responsibilitychain.TypeConfig;

/**
 * Created by Allure on 2017/8/14.
 */

public class MiddleHandle extends TaskLeader {
    @Override
    public int getType() {
        return TypeConfig.MIDDEL;
    }

    @Override
    public void handle(TaskRequest type) {
        System.out.println("中等难度请求");

    }
}
