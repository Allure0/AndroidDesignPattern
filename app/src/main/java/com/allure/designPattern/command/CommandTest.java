package com.allure.designPattern.command;

/**
 * Created by Allure on 2017/8/14.
 */

public class CommandTest {

    public static void main(String[] args) {

        //第一种方式 直接使用 不采用命令模式 直接调用
        MilitaryTraining militaryTraining = new MilitaryTraining();
        militaryTraining.goose();//正步
        militaryTraining.march();//齐步

        //采用命令模式调用
        /**
         * 优点：命令模式耦合度更低，扩展性更强，维护方便，
         * 可对命令进行组合使用
         * 对新的命令扩展更容易
         *
         * 缺点：命令类很多,对基础技术要求较高，否则难于阅读代码。
         */
        MilitaryTraining militaryTraining1 = new MilitaryTraining();
        GooseCommand gooseCommand = new GooseCommand(militaryTraining1);
        MarchCommand marchCommand = new MarchCommand(militaryTraining1);

        CommandController commandController = new CommandController();

        commandController.setGooseCommand(gooseCommand);
        commandController.setMarchCommand(marchCommand);

        commandController.gooseCommand();
        commandController.marchCommadn();

    }
}
