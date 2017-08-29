package com.allure.designPattern.template;

/**
 * Created by Allure on 2017/8/29.
 */

public class TemplateTest {
    public static void main(String[] args) {

        //员工一号
        StaffOneRequest staffOneRequest=new StaffOneRequest(20,10);//审核金额20,通过金额10
        staffOneRequest.review();

        //员工二号
        StaffOneRequest staffOneRequest2=new StaffOneRequest(50,50);//审核金额50,通过金额50
        staffOneRequest2.review();
    }
}
