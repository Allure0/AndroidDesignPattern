package com.allure.designPattern.prototype;

import java.util.ArrayList;

/**
 * 原型模式 实现Cloneable接口
 * Created by Allure on 2017/8/11.
 */

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        cp.name = "原始数据";
        for (int i = 0; i < 10; i++) {
            cp.list.add(i, String.valueOf(i));//填充数据
        }
        ConcretePrototype cloneConcretePrototype = (ConcretePrototype) cp.clone();//实现拷贝
        cloneConcretePrototype.name = "拷贝数据";
        System.out.println(cp.toString());
        System.out.println(cloneConcretePrototype.toString());
    }
}


//原型，实现Cloneable接口
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

//具体的拷贝数据
class ConcretePrototype extends Prototype {

    public String name;
    public ArrayList<String> list = new ArrayList<>();

    public ConcretePrototype() {
        System.out.println("执行了ConcretePrototype构造函数");
    }

    //重写clone方法将具体的集合、数组、对象等包含的具体数据修改为深拷贝
    @Override
    public Prototype clone() {
        ConcretePrototype prototype = null;
        prototype = (ConcretePrototype) super.clone();
        prototype.list = (ArrayList<String>) this.list.clone();
        return prototype;

    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';

    }


    public void show() {
        System.out.println("原型模式实现类");
    }
}