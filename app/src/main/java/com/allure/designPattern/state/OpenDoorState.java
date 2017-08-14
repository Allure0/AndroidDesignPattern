package com.allure.designPattern.state;

/**
 * Created by Allure on 2017/8/14.
 */

public class OpenDoorState implements DoorState {
    @Override
    public void goInDoor() {
        System.out.print("进门");
    }

    @Override
    public void getOutDoor() {
        System.out.print("出门");
    }
}
