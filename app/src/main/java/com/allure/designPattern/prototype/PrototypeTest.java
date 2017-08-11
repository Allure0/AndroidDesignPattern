package com.allure.designPattern.prototype;

/**
 * 原型模式 对象拷贝
 * Created by Allure on 2017/8/11.
 */

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}

class Prototype implements Cloneable {
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}

class ConcretePrototype extends Prototype {
    public void show() {
        System.out.println("原型模式实现类");
    }
}