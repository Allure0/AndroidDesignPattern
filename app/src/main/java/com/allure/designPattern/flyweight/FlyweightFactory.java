package com.allure.designPattern.flyweight;

import com.allure.designPattern.flyweight.composite.ConcreteCompositeFlyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元对象不能直接new进行实例化,需要通过享元工厂来得到
 * 享元工厂对象只会在项目中存在一个,可以是一个单例模式
 * Created by Allure on 2017/9/5.
 */

public class FlyweightFactory {

    /**
     * 存储键值对
     * String键:内部状态 不可变
     * Flyweight值:外部状态 可变
     */
    private Map<String, Flyweight> files = new HashMap<String, Flyweight>();

    public FlyweightFactory() {
    }

    public static final FlyweightFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }


    private static class SingletonHolder {
        private static final FlyweightFactory INSTANCE = new FlyweightFactory();
    }


    //单纯享元虎丘
    public Flyweight getFactory(String key) {
        //先从系统中获取
        Flyweight fly = files.get(key);
        if (null ==fly ) {
            // 如果对象不存在则创建一个新对象并且添加
            fly = new ConcreteFlyweight(key);
            files.put(key, fly);
        }
        return fly;
    }

    //复合享元
    public Flyweight getFactory(List<String> compositeState) {
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

        for (String inSideState : compositeState) {
            //添加一个享元对象
            compositeFly.addFly(inSideState,getFactory(inSideState));
        }

        return compositeFly;
    }

    //获取对象个数
    public int getFlyWeightSize() {
        return files.size();
    }
}
