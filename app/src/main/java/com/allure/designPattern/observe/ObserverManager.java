package com.allure.designPattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/8/14.
 */

public class ObserverManager implements Subject {
    private static ObserverManager observerManager;
    //观察者接口集合
    private List<ObserverListener> list = new ArrayList<>();

    //DCL双重加锁单利
    public static ObserverManager getInstance() {
        if (null == observerManager) {
            synchronized (ObserverManager.class) {
                if (null == observerManager) {
                    observerManager = new ObserverManager();
                }
            }

        }
        return  observerManager;

    }
    //注册

    @Override
    public void register(ObserverListener observer) {
        if (null != observer) {
            list.add(observer);
        }

    }
    //反注册

    @Override
    public void unRegister(ObserverListener observer) {
        if (null != observer) {
            list.remove(observer);
        }
    }

    //通知
    @Override
    public void notifyChanged( Object o) {
        for (ObserverListener observerListener : list) {
            observerListener.update(o);
        }
    }


}
