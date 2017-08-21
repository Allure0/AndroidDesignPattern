package com.allure.designPattern.responsibilitychain;

import com.allure.designPattern.responsibilitychain.handle.HardHandle;
import com.allure.designPattern.responsibilitychain.handle.MiddleHandle;
import com.allure.designPattern.responsibilitychain.handle.NormalHandle;
import com.allure.designPattern.responsibilitychain.request.HardRequest;
import com.allure.designPattern.responsibilitychain.request.MiddleRequest;
import com.allure.designPattern.responsibilitychain.request.NormalRequest;

/**
 * Created by Allure on 2017/8/14.
 */

public class ResponsibilityTest {
    public static void main(String[] args) {
        //构造三个处理对象
        NormalHandle handler1 = new NormalHandle();
        MiddleHandle handler2 = new MiddleHandle();
        HardHandle handler3 = new HardHandle();
        //串成一个责任链
        handler1.companyLeader=handler2;
        handler2.companyLeader=handler3;
        //构造三个请求
        NormalRequest request1 = new NormalRequest(TypeConfig.NORMAL);
        MiddleRequest request2 = new MiddleRequest(TypeConfig.MIDDEL);
        HardRequest request3 = new HardRequest(TypeConfig.HARD);

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }


}
