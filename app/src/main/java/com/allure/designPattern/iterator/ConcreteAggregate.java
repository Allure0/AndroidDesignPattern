package com.allure.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/8/28.
 */

public class ConcreteAggregate implements Aggregate {

    private List list = new ArrayList();

    public void add(Object obj) {
        list.add(obj);
    }

    public Iterator iterator() {
        return new ConcreteIterator(list);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

}