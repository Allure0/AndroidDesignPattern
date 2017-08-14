package com.allure.designPattern.state;

/**
 * Created by Allure on 2017/8/14.
 */

public class DoorController implements Controller {

    private DoorState doorState;

    public DoorState setDoorState(DoorState doorState) {
        this.doorState = doorState;
        return doorState;
    }

    @Override
    public void openDoor() {
        setDoorState(new OpenDoorState());
    }

    @Override
    public void closeDoor() {
        setDoorState(new CloseDoorState());
    }
}
