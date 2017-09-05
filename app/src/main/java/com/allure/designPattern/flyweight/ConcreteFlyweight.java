package com.allure.designPattern.flyweight;

/**
 * 具体的单纯享元角色
 * Created by Allure on 2017/9/5.
 */

public class ConcreteFlyweight  implements  Flyweight {

    private  String inSideState=null;//内部状态不可变

    public ConcreteFlyweight(String inSideState) {
        this.inSideState = inSideState;
    }

    @Override
    public void show(String name) {
//        System.out.println("内部状态:"+this.inSideState);
//        System.out.println("外部状态:"+name);
        System.out.println(this.inSideState+"职位");
        System.out.println("做"+inSideState+"的职位的人的名字:"+name);
    }
}
