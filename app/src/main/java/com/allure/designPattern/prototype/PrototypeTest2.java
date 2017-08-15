package com.allure.designPattern.prototype;

import java.util.ArrayList;

/**
 * 原型模式 不实现Cloneable接口
 * Created by Allure on 2017/8/15.
 */

public class PrototypeTest2 {
    public static void main(String[] args) {
        ConcretePrototype2 cp = new ConcretePrototype2();
        cp.name = "原始数据";
        for (int i = 0; i < 10; i++) {
            cp.list.add(i, String.valueOf(i));//填充数据
        }
        ConcretePrototype2 cloneConcretePrototype = (ConcretePrototype2) cp.clone();//实现拷贝
        cloneConcretePrototype.name = "拷贝数据";
        cloneConcretePrototype.list.add("追加测试数据");
        System.out.println(cp.toString());
        System.out.println(cloneConcretePrototype.toString());
    }

}

class ConcretePrototype2 {

    public String name;
    public ArrayList<String> list = new ArrayList<>();

    public ConcretePrototype2() {
        System.out.println("执行了ConcretePrototype2构造函数");
    }

    public ConcretePrototype2 clone() {
        //手动new对象进行赋值
//        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
//        concretePrototype2.name = this.name;
//        concretePrototype2.list = this.list;
//        return concretePrototype2;

        //将具体的集合修改为深拷贝
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        concretePrototype2.name = this.name;
        concretePrototype2.list = (ArrayList<String>) this.list.clone();

        return concretePrototype2;

    }


    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "name='" + name + '\'' +
                ", list=" + list +
                '}';

    }


    public void show() {
        System.out.println("原型模式实现类");
    }
}