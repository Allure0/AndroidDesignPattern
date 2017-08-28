package com.allure.designPattern.iterator.genericparadigm;

/**
 * Created by Allure on 2017/8/28.
 */

public class IteratorTest2 {

    public static void main(String[] args) {

        Aggregate2 aggregate=new ConcreteAggregate2();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        aggregate.add("5");
        aggregate.add("6");
        Iterator2 iterator = (Iterator2) aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println("\n"+iterator.next());
        }
    }
}
