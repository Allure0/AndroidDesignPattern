package com.allure.designPattern.factory.privatefactory;

import com.allure.designPattern.factory.CodeMonkey;
import com.allure.designPattern.factory.reflexfactory.IGenerator;

/**
 * 内部创建CodeMonkey
 * 私有构造就不允许外部通过new的方式来创建,而工厂则通过反射和更改访问权限来生成
 * Created by Allure on 2017/8/11.
 */

public class CodeMonkeyPrivateFactory extends IGenerator {
    public <T extends CodeMonkey> T generateCodeMonkey(Class<T> clazz) throws Exception {
        CodeMonkey iPhone = null;
        Class phone = Class.forName(clazz.getName());
        //拿到构造器不检测权限
        phone.getDeclaredConstructor().setAccessible(true);
        iPhone = (CodeMonkey) phone.newInstance();
        return (T) iPhone;
    }
}

