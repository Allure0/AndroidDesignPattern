package com.allure.designPattern.composite.transparent;

/**
 * Created by Allure on 2017/9/1.
 */

public class TransparentLeaf extends TransparentComponent {


    public TransparentLeaf(String name) {
        super(name);
    }

    @Override
    public void println(String space) {
        System.out.println(space + "-" + getName());

    }
}
