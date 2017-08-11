package com.allure.designPattern.singlecase;

/**
 * 枚举单例         SingleTest6.INSTANCE.getInstance()
 *
 * 枚举默认线程安全，写法优雅简单
 * Created by Allure on 2017/8/11.
 */

public enum SingleTest6 {
    INSTANCE;
    private CaiPiao instance;

    SingleTest6() {
        instance = new CaiPiao();
    }

    public CaiPiao getInstance() {
        return instance;
    }

    class CaiPiao {

    }
}
