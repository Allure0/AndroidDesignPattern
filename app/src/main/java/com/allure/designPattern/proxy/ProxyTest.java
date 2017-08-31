package com.allure.designPattern.proxy;

import com.allure.designPattern.proxy.dynamic.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by Allure on 2017/8/31.
 */

public class ProxyTest {

    public static void main(String[] args) {
        //静态代理
        UserBuyCar userBuyCar=new UserBuyCar();
        AudiCarStoreProxy audiCarStoreProxy=new AudiCarStoreProxy(userBuyCar);
        audiCarStoreProxy.buyCar();



        //动态代理
        UserBuyCar userBuyCar1=new UserBuyCar();
        DynamicProxy dynamicProxy=new DynamicProxy(userBuyCar1);
        AudiCar audiCar=(AudiCar) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{AudiCar.class},  dynamicProxy);
        audiCar.buyCar();



    }
}
