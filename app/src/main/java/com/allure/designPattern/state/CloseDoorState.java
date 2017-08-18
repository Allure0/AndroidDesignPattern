package com.allure.designPattern.state;

/**
 * Created by Allure on 2017/8/14.
 */

public class CloseDoorState implements  DoorState {
    @Override
    public void goInDoor() {
        System.out.print("\n"+"关门状态:不可进门");

    }

    @Override
    public void getOutDoor() {
        System.out.print("\n"+"关门状态:不可以出门");

    }
}
