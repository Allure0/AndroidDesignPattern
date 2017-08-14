package com.allure.designPattern.state;

/**
 * Created by Allure on 2017/8/14.
 */

public class StateTest {

    public static void main(String[] args) {

        DoorController doorController=new DoorController();
        OpenDoorState openDoorState= (OpenDoorState) doorController.setDoorState(new OpenDoorState());
        openDoorState.getOutDoor();
        openDoorState.goInDoor();


        CloseDoorState closeDoorState= (CloseDoorState) doorController.setDoorState(new CloseDoorState());
        closeDoorState.getOutDoor();
        closeDoorState.goInDoor();
    }

}
