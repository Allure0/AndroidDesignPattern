package com.allure.designPattern.singlecase;

/**
 * 单利模式 加锁
 * synchronized函数同步加载，解决多线程问题，比较消耗资源
 * Created by Allure on 2017/8/11.
 */

public class SingleTest2 {

    private  static  SingleTest2 instance=null;

    public SingleTest2() {
    }
    public  static synchronized SingleTest2 getInstance(){
        if(instance==null){
            instance=new SingleTest2();
        }
        return instance;
    }
}
