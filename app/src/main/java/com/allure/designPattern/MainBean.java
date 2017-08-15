package com.allure.designPattern;

import java.io.Serializable;

/**
 * Created by Allure on 2017/8/15.
 */

public class MainBean implements Serializable {
    private  String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
