package com.allure.designPattern.state;

/**
 * Created by Allure on 2017/8/14.
 */

public class CloseDoorState implements  DoorState {
    @Override
    public void goInDoor() {
        System.out.print("进不了门");

    }

    @Override
    public void getOutDoor() {
        System.out.print("出不了门");

    }
}
