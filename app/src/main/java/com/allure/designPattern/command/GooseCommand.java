package com.allure.designPattern.command;

/**
 * Created by Allure on 2017/8/14.
 */

public class GooseCommand implements  Command {
    private MilitaryTraining militaryTraining;

    public void setMilitaryTraining(MilitaryTraining militaryTraining) {
        this.militaryTraining = militaryTraining;
    }

    @Override
    public void doSomothing() {
        if(militaryTraining!=null){
            militaryTraining.goose();
        }
    }
}
