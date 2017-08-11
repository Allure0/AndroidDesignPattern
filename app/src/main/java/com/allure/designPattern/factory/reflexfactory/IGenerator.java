package com.allure.designPattern.factory.reflexfactory;

import com.allure.designPattern.factory.CodeMonkey;

/**
 * 工厂结合反射使用
 *
 *  通过泛型来约束参数类型
 * Created by Allure on 2017/8/11.
 */

public abstract class IGenerator {
    public abstract <T extends CodeMonkey>T generateCodeMonkey(Class<T> clazz) throws Exception;
}
