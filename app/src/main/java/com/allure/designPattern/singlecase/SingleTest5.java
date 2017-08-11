package com.allure.designPattern.singlecase;

/**
 * 静态内部类单例模式  延迟加载、线性安全、减少内存消耗
 *
 * 当第一次加载Singleton 类的时候并不会初始化INSTANCE
 * ，只有第一次调用Singleton 的getInstance（）方法时才会导致INSTANCE 被初始化。
 * 因此，第一次调用getInstance（）方法会导致虚拟机加载SingletonHolder 类，
 * 这种方式不仅能够确保单例对象的唯一性，同时也延迟了单例的实例化。
 * Created by Allure on 2017/8/11.
 */

public class SingleTest5 {
    private SingleTest5() {
    }

    public static final SingleTest5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //定义的静态内部类
    private static class SingletonHolder {
        private static final SingleTest5 INSTANCE = new SingleTest5();  //创建实例的地方
    }
}
