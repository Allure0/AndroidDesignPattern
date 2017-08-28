package com.allure.designPattern.iterator.genericparadigm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/8/28.
 */

public class ConcreteAggregate2<T> implements Aggregate2<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator2<T> iterator() {
        return  new ConcreteIterator2<>(list);
    }


}


