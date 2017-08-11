package com.allure.designPattern.singlecase;

/**
 * 单例模式 懒汉式
 *
 * 适用于单线程
 * Created by Allure on 2017/8/11.
 */

public class SingleTest1 {


    private  static SingleTest1 instance=null;

    public SingleTest1() {
    }
    public  static SingleTest1 getInstance(){
        if(instance==null){
            instance=new SingleTest1();
        }
        return instance;
    }
}
