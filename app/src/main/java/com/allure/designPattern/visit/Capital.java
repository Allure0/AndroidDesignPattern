package com.allure.designPattern.visit;

/**
 * 资金允许的访问者接口
 * Created by Allure on 2017/8/30.
 */

public interface Capital {
    //允许的访问者
    void  accept(Visitor visitor);
}
