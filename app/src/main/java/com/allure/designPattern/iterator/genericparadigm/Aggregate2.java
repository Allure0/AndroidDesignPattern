package com.allure.designPattern.iterator.genericparadigm;

/**
 * Created by Allure on 2017/8/28.
 */

public interface Aggregate2<T> {
    void add(T obj);

    void remove(T obj);

    Iterator2<T> iterator();
}
