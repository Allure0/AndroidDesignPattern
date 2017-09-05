package com.allure.designPattern.facade;

/**
 * Created by Allure on 2017/9/5.
 */

public class FacadeTest {

    public static void main(String[] args) {

        Facade facade=new Facade();
        facade.dance();
        facade.sing();
        facade.playThePiano();
        facade.combat();
    }
}
