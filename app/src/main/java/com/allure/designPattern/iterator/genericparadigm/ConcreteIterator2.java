package com.allure.designPattern.iterator.genericparadigm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/8/28.
 */

public class ConcreteIterator2<T> implements  Iterator2<T> {
    private int position;
    private  List<T> list = new ArrayList<>();

    public ConcreteIterator2( List<T> list){
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
    public T next() {
        T obj = null;
        if(this.hasNext()){
            obj = this.list.get(position++);
        }
        return obj;
    }
}
