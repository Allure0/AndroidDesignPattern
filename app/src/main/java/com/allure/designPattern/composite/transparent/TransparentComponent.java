package com.allure.designPattern.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/9/1.
 */

public abstract class TransparentComponent {

    protected List<TransparentComponent> components = new ArrayList<>();

    private String name;

    public TransparentComponent(String name) {
        this.name = name;
    }

    public void addChild(TransparentComponent component) {
        throw new UnsupportedOperationException("TransparentComponent不支持此方法");
    }


    public void removeChild(TransparentComponent component) {
        throw new UnsupportedOperationException("TransparentComponent不支持此方法");
    }


    public void clearAll() {
        throw new UnsupportedOperationException("TransparentComponent不支持此方法");
    }


    public List<TransparentComponent> getList() {
        throw new UnsupportedOperationException("TransparentComponent不支持此方法");
    }


    public abstract void println(String space);


    public List<TransparentComponent> getComponents() {
        return components;
    }

    public void setComponents(List<TransparentComponent> components) {
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
