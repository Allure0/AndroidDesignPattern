package com.allure.designPattern.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * 资金管理笔记类  用于添加访问
 * Created by Allure on 2017/8/30.
 */

public class CapitalNote {

    private List<Capital> capitals=new ArrayList<>();

    //添加资金的收入和支出
    public  void add(Capital capital){
        capitals.add(capital);
    }

    //添加访问者
    public  void acceptVistor(Visitor visitor){
        for (Capital capital : capitals){
            capital.accept(visitor);
        }

    }
}
