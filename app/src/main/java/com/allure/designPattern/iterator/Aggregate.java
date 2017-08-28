package com.allure.designPattern.iterator;

/**
 * Created by Allure on 2017/8/28.
 */

public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();
}
