package com.allure.designPattern.factory.abstractfactory;

/**
 * Created by Allure on 2017/8/14.
 */

public class AndroidProductManager implements  ProductManager {
    @Override
    public void showProductManager() {
        System.out.println("我是Android产品经理");
    }
}
