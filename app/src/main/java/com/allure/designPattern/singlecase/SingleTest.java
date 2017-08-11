package com.allure.designPattern.singlecase;

/**
 *
 *
 * 在Android中存在一些单例模式的类，
 * 比如InputMethodManager类，CalendarDatabaseHelper类
 * 、Editable类，我们在做项目的时候也能用到单例模式，比如数据库的设计和优化，账号信息管理系统的开发
 *
 * 单利 饿汉式
 *
 * 类加载即进行初始化实力操作，比较消耗资源
 * Created by Allure on 2017/8/11.
 */

public class SingleTest {
    public  static  final SingleTest singleTest1=new SingleTest();

    public SingleTest() {
    }
    public  static SingleTest getSingleTest1(){

        return singleTest1;
    }
}
