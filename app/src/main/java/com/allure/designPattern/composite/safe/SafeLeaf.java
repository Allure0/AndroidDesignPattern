package com.allure.designPattern.composite.safe;

/**
 * 安全组合  抽象角色
 * Created by Allure on 2017/9/1.
 */

public class SafeLeaf implements  SafeComponent{
    private String name;

    public SafeLeaf(String name) {
        this.name = name;
    }

    @Override
    public void println(String space) {
        System.out.println(space + "-" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
