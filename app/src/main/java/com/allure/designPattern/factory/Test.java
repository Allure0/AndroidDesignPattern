package com.allure.designPattern.factory;

import com.allure.designPattern.factory.abstractfactory.AbstractProductManagerFactory;
import com.allure.designPattern.factory.abstractfactory.AndroidProductManager;
import com.allure.designPattern.factory.cachefactory.CodeMonkeyCacheFactory;
import com.allure.designPattern.factory.easyfactory.CodeMonkeyEasyFactory;
import com.allure.designPattern.factory.privatefactory.CodeMonkeyPrivateFactory;
import com.allure.designPattern.factory.reflexfactory.CodeMonkeyReflexFactory;

/**
 * 工厂模式（非抽象型）
 * Created by Allure on 2017/8/11.
 */

public class Test {


    public static void main(String[] args) throws Exception {

        //标准工厂
        CodeMonkey codeMonkey = new AndroidCodeMonkey();
        codeMonkey.showCodeMonkeyType();
        new IosCodeMonkey().showCodeMonkeyType();

        //简单工厂
        CodeMonkeyEasyFactory.generateCodeMonkey(CodeMonkeyEasyFactory.GENERATE_ANDROID).showCodeMonkeyType();
        CodeMonkeyEasyFactory.generateCodeMonkey(CodeMonkeyEasyFactory.GENERATE_IOS).showCodeMonkeyType();

//        //结合反射工厂

        new CodeMonkeyReflexFactory().generateCodeMonkey(AndroidCodeMonkey.class).showCodeMonkeyType();

        //产品类私有构造应用
        new CodeMonkeyPrivateFactory().generateCodeMonkey(AndroidCodeMonkey.class).showCodeMonkeyType();

        //缓存工厂
        new CodeMonkeyCacheFactory().generateCodeMonkey(AndroidCodeMonkey.class).showCodeMonkeyType();

        //抽象工厂
        new AbstractProductManagerFactory().showCodeMonkeyType(AndroidCodeMonkey.class).showCodeMonkeyType();
        new AbstractProductManagerFactory().showProductManager(AndroidProductManager.class).showProductManager();


    }


}
