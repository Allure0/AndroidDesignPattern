package com.allure.designPattern.factory.reflexfactory;

import com.allure.designPattern.factory.CodeMonkey;

/**
 * 反射工厂
 * 泛型来约束输入输出的参数类型,把异常抛到上层去处理并实现具体的工厂.
 * Created by Allure on 2017/8/11.
 */

public class CodeMonkeyReflexFactory extends IGenerator {
    @Override
    public <T extends CodeMonkey> T generateCodeMonkey(Class<T> clazz) throws Exception {
        CodeMonkey codeMonkey = null;
        codeMonkey = (CodeMonkey) Class.forName(clazz.getName()).newInstance();
        return (T)codeMonkey;
    }
}
