package com.allure.designPattern.composite.transparent;

import java.util.List;

/**
 * Created by Allure on 2017/9/1.
 */

public class TransparentComposite extends TransparentComponent {

    public TransparentComposite(String name) {
        super(name);
    }

    public void addChild(TransparentComponent component) {
        components.add(component);
    }

    public void removeChild(TransparentComponent component) {
        components.remove(component);
    }

    public void clearAll() {
        components.clear();
    }

    public List<TransparentComponent> getList() {
        return components;
    }

    @Override
    public void println(String space) {
        //首先输出自身
        System.out.println(space + "+" + getName());

        //如果还包含有子节点对象,输出这些对象
        if (this.components != null) {
            //向后缩进,主要为了打印效果,没有实际意义
            space += "  ";
            for (TransparentComponent component : components) {
                component.println(space);
            }
        }


    }
}
