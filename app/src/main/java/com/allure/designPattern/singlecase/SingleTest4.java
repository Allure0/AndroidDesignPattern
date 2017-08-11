package com.allure.designPattern.singlecase;

/**
 * 单例
 * DCL双重校验模式（JDK1.5前会失效）
 * Created by Allure on 2017/8/11.
 */

public class SingleTest4 {
    private  static SingleTest4 instance=null;//静态变量
    public SingleTest4() {
    }
    public  static SingleTest4 getInstance(){
        if (instance == null) {//第一层校验
            synchronized (SingleTest4.class) {
                if (instance == null) {//第二层校验
                    instance = new SingleTest4();
                }
            }
        }
        return instance;
    }
}
