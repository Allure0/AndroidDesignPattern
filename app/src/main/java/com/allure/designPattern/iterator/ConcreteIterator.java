package com.allure.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/8/28.
 */

public class ConcreteIterator implements Iterator {

    private int position;
    private List list = new ArrayList();

    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position == list.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(position++);
        }
        return obj;
    }
}
