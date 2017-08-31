package com.allure.designPattern.proxy;

/**
 * Created by Allure on 2017/8/31.
 */

public class CarStoreProxy implements Car {
    private UserBuyCar car;

    public CarStoreProxy(UserBuyCar car) {
        this.car = car;
    }

    @Override
    public void buyCar() {
        if (car.getName().equals(ProxyTest.AUDI) ||
                car.getName().equals(ProxyTest.BMW) ||
                car.getName().equals(ProxyTest.BENZ)) {
            car.buyCar();
        } else {
            System.out.print("\n" + "用户什么也没买");
        }
    }
}
