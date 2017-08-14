package com.allure.designPattern.observe;

/**
 * 被观察者
 * Created by Allure on 2017/8/14.
 */

public interface Subject {
    void  register(ObserverListener observer);
    void  unRegister(ObserverListener observer);
    void  notifyChanged( Object arg);

}
