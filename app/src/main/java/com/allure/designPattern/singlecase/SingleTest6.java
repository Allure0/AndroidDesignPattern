package com.allure.designPattern.singlecase;

/**
 * 枚举单例         SingleTest6.INSTANCE.getInstance()
 *
 * 枚举默认线程安全，写法优雅简单,实现线程安全，高性能，还能防止反序列化重新创建新的对象，防止被反射攻击
 * Created by Allure on 2017/8/11.
 */

public enum SingleTest6 {
    //第一种方式
//    INSTANCE;
//    private CaiPiao instance;
//
//    SingleTest6() {
//        instance = new CaiPiao();
//    }
//
//    public CaiPiao getInstance() {
//        return instance;
//    }
//
//    class CaiPiao {
//
//    }


//第二种方式
    INSTANCE2{
        @Override
        protected void CaiPiao() {
            System.out.println("彩票");
        }

    };
    protected abstract void CaiPiao();
}
