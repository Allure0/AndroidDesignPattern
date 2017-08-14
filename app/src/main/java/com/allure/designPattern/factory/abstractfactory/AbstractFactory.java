package com.allure.designPattern.factory.abstractfactory;

import com.allure.designPattern.factory.CodeMonkey;

/**
 * Created by Allure on 2017/8/14.
 */

public abstract  class AbstractFactory {
    public abstract <T extends CodeMonkey>T showCodeMonkeyType(Class<T> clazz) throws Exception;
    public abstract <T extends ProductManager>T showProductManager(Class<T> clazz) throws Exception;
}
