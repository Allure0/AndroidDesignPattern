package com.allure.designPattern.factory.cachefactory;

import com.allure.designPattern.factory.CodeMonkey;
import com.allure.designPattern.factory.reflexfactory.IGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Allure on 2017/8/11.
 */

public class CodeMonkeyCacheFactory  extends IGenerator {
    private Map<String, CodeMonkey> map = new HashMap<>();

    @Override
    public <T extends CodeMonkey> T generateCodeMonkey(Class<T> clazz) throws Exception {
        CodeMonkey CodeMonkey = null;
        if (map.containsKey(clazz.getName()))
            CodeMonkey = map.get(clazz.getName());
        else {
            CodeMonkey = (CodeMonkey) Class.forName(clazz.getName()).newInstance();
            map.put(clazz.getName(), CodeMonkey);
        }
        return (T) CodeMonkey;
    }
}
