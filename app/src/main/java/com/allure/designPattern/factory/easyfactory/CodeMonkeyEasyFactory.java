package com.allure.designPattern.factory.easyfactory;

import com.allure.designPattern.factory.AndroidCodeMonkey;
import com.allure.designPattern.factory.CodeMonkey;
import com.allure.designPattern.factory.IosCodeMonkey;

/**
 * 简单工厂（不符合开闭原则，如果有新增程序猿修改需要更改此工厂，适用于业务需求，不适用于架构需求）
 * Created by Allure on 2017/8/11.
 */

public class CodeMonkeyEasyFactory {
    public final static String GENERATE_IOS = "android";
    public final static String GENERATE_ANDROID = "ios";
    public static CodeMonkey generateCodeMonkey(String flag) throws Exception {
        CodeMonkey codeMonkey = null;
        switch (flag){
            case GENERATE_ANDROID:
                codeMonkey =  new AndroidCodeMonkey();
                break;
            case GENERATE_IOS:
                codeMonkey =  new IosCodeMonkey();
                break;

            default:
                throw new Exception("UNDEFINED FLAG");
        }
        return codeMonkey;
    }
}
