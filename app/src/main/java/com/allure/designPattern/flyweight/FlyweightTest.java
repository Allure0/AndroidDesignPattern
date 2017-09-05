package com.allure.designPattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/9/5.
 */

public class FlyweightTest {
    public static void main(String[] args) {

        //单纯享元
        FlyweightFactory flyweightFactory=FlyweightFactory.getInstance();
        Flyweight flyweight=flyweightFactory.getFactory(new String("Android程序猿"));
        flyweight.show("A");
        System.out.println("");


        Flyweight flyweight1=flyweightFactory.getFactory(new String("前端程序猿"));
        flyweight1.show("B");
        System.out.println("");

        Flyweight flyweight2=flyweightFactory.getFactory(new String("高级Java工程师"));
        flyweight2.show("C");
        System.out.println("");

        Flyweight flyweight3=flyweightFactory.getFactory(new String("Android程序猿"));
        flyweight3.show("A");
        System.out.println("");

        //比较彼此的内存空间,Android程序猿存在两个,指向同一个内存地址
        System.out.println("单纯享元模式是否可以共享对象:" +(flyweight==flyweight1));//false
        System.out.println("");
        System.out.println("单纯享元模式是否可以共享对象:" +(flyweight==flyweight2));//false
        System.out.println("");
        System.out.println("单纯享元模式是否可以共享对象:" +(flyweight==flyweight3));//true
        System.out.println("");
        System.out.println("单纯享元模式是否可以共享对象:" +(flyweight1==flyweight2));//false
        System.out.println("");
        System.out.println("单纯享元模式是否可以共享对象:" +(flyweight1==flyweight3));//false
        System.out.println("");
        System.out.println("单纯享元模式是否可以共享对象:" +(flyweight2==flyweight3));//false
        System.out.println("");
        System.out.println("原本有4个对象,实际有:"+flyweightFactory.getFlyWeightSize()+"个");


        System.out.println("------下面开始是复合享元--------");



        //复合享元

        List<String> list=new ArrayList<>();
        list.add("Android程序猿");
        list.add("前端程序猿");
        list.add("高级Java工程师");
        list.add("Android程序猿");

        Flyweight flyweight4=flyweightFactory.getFactory(list);
        flyweight4.show("A");//外部状态

        System.out.println("");

        Flyweight flyweight5=flyweightFactory.getFactory(list);
        flyweight5.show("B");

        System.out.println("");


        System.out.println("复合享元模式是否可以共享对象：" + (flyweight4 == flyweight5));

        System.out.println("---------------------------------");



    }


}
