package com.allure.designPattern.command;

/**
 * 单一的命令具体做的动作
 * Created by Allure on 2017/8/14.
 */

public class MarchCommand implements  Command {
    private  MilitaryTraining militaryTraining;

    public void setMilitaryTraining(MilitaryTraining militaryTraining) {
        this.militaryTraining = militaryTraining;
    }

    @Override
    public void doSomothing() {
        if (militaryTraining!=null){
            militaryTraining.march();
        }
    }
}
