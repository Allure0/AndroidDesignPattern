package com.allure.designPattern.state;

/**
 * Created by Allure on 2017/8/14.
 */

public class StateTest {

    public static void main(String[] args) {

        DoorController doorController = new DoorController(new OpenDoorState());
        doorController.openDoor();
        doorController.closeDoor();

        DoorController doorController1 = new DoorController(new CloseDoorState());
        doorController1.openDoor();
        doorController1.closeDoor();

    }

}
