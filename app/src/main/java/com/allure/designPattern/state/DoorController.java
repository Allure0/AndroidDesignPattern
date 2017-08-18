package com.allure.designPattern.state;

/**
 * Created by Allure on 2017/8/14.
 */

public class DoorController implements Controller {

    private DoorState doorState;

    public DoorController() {
    }

    public DoorController(DoorState state) {
        this.doorState = state;
    }



    @Override
    public void openDoor() {//开门状态
        doorState.goInDoor();//要进门
    }

    @Override
    public void closeDoor() {//关门状态
        doorState.getOutDoor();//想出门
    }
}
