package com.allure.designPattern.proxy;

/**
 * Created by Allure on 2017/8/31.
 */

public class AudiCarStoreProxy implements AudiCar {
    private AudiCar car;

    public AudiCarStoreProxy(AudiCar car) {
        this.car = car;
    }

    @Override
    public void buyCar() {
        car.buyCar();
    }
}
