package com.allure.designPattern.flyweight;

/**
 * 抽象享元角色
 * Created by Allure on 2017/9/5.
 */

public interface Flyweight {
    //name是职位的人叫什么 是一个抽象外部状态
    public void show(String name);
}
