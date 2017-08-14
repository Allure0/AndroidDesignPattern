package com.allure.designPattern.factory.abstractfactory;

import com.allure.designPattern.factory.CodeMonkey;

/**
 * 抽象工厂 使用得出 产品经理种类和程序猿种类
 * 支持多条产品线产品线，如果有新的产品线需要更改原来的工厂，不符合开闭原则，但是对于单一产品线的子类产品的增加很方便
 * Created by Allure on 2017/8/14.
 */

public class AbstractProductManagerFactory extends AbstractFactory {
    @Override
    public <T extends CodeMonkey> T showCodeMonkeyType(Class<T> clazz) throws Exception {
        CodeMonkey codeMonkey= (CodeMonkey) clazz.forName(clazz.getName()).newInstance();
        return (T) codeMonkey;
    }

    @Override
    public <T extends ProductManager> T showProductManager(Class<T> clazz) throws Exception {
        ProductManager productManager= (ProductManager) clazz.forName(clazz.getName()).newInstance();
        return (T) productManager;
    }
}
