package com.allure.designPattern.command;

/**
 * 单一的命令具体做的动作
 * Created by Allure on 2017/8/14.
 */

public class MarchCommand implements  Command {
    private  MilitaryTraining militaryTraining;

    public MarchCommand(MilitaryTraining militaryTraining1) {
        this.militaryTraining = militaryTraining1;
    }

    @Override
    public void doSomothing() {
        if (militaryTraining!=null){
            militaryTraining.march();
        }
    }
}
