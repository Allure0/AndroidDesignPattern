package com.allure.designPattern.command;

/**
 * 命令控制管理器
 * Created by Allure on 2017/8/14.
 */

public class CommandController {
    private  GooseCommand gooseCommand;
    private  MarchCommand marchCommand;

    public void setGooseCommand(GooseCommand gooseCommand) {
        this.gooseCommand = gooseCommand;
    }

    public void setMarchCommand(MarchCommand marchCommand) {
        this.marchCommand = marchCommand;
    }

    public void  marchCommadn(){
        if(marchCommand!=null){
            marchCommand.doSomothing();
        }
    }

    public  void  gooseCommand(){
        if(gooseCommand!=null){
            gooseCommand.doSomothing();
        }
    }
}
