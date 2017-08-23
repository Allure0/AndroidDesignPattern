package com.allure.designPattern.command;

/**
 * 军训
 * 命令模式具体的2个命令
 * Created by Allure on 2017/8/14.
 */

public class MilitaryTraining {

    public void march() {
        System.out.print("\n"+"军训齐步");
    }

    public void goose() {
        System.out.print("\n"+"军训正步");

    }
}
