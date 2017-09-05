package com.allure.designPattern.flyweight.composite;

import com.allure.designPattern.flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合的享享元
 * Created by Allure on 2017/9/5.
 */

public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<String, Flyweight> hashMap = new HashMap<String, Flyweight>();

    @Override
    public void show(String name) {
        Flyweight fly = null;
        for (String inSideState : hashMap.keySet()) {
            fly = hashMap.get(inSideState);
            fly.show(name);
        }
    }

    //添加一个新的享元到集合中
    public void addFly(String inSideState, Flyweight flyweight) {

        hashMap.put(inSideState, flyweight);
    }
}
