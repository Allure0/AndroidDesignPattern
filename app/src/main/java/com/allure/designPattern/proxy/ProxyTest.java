package com.allure.designPattern.proxy;

import com.allure.designPattern.proxy.dynamic.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by Allure on 2017/8/31.
 */

public class ProxyTest {

    public  static  final  String AUDI="audi";
    public  static  final  String BMW="bmw";
    public  static  final  String BENZ="benz";
    public  static  final  String NONE="none";



    public static void main(String[] args) {
        //静态代理 买奥迪
        UserBuyCar userBuyCar=new UserBuyCar();
        userBuyCar.setName(AUDI);
        CarStoreProxy audiCarStoreProxy=new CarStoreProxy(userBuyCar);
        audiCarStoreProxy.buyCar();

        //静态代理 什么也不买
        UserBuyCar userBuyCar1=new UserBuyCar();
        userBuyCar1.setName(NONE);
        CarStoreProxy carStoreProxy=new CarStoreProxy(userBuyCar1);
        carStoreProxy.buyCar();



        //动态代理 买奔驰
        UserBuyCar userBuyCar2=new UserBuyCar();
        userBuyCar2.setName(BENZ);
        DynamicProxy dynamicProxy=new DynamicProxy(userBuyCar2);
        Car car=(Car) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Car.class},  dynamicProxy);
        car.buyCar();



    }
}
