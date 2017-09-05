package com.allure.designPattern.facade;

/**
 * 外观类
 * Created by Allure on 2017/9/5.
 */

public class Facade {
    private StudentA studentA;
    private StudentB studentB;
    private StudentC studentC;

    public Facade() {
        studentA=new StudentA();
        studentB=new StudentB();
        studentC=new StudentC();
    }

    public Facade(StudentA studentA, StudentB studentB, StudentC studentC) {
        this.studentA = studentA;
        this.studentB = studentB;
        this.studentC = studentC;
    }

    //跳舞的同学
    public void dance(){
        studentA.dance();
        studentB.dance();
    }

    //唱歌的同学
    public void sing(){
        studentA.sing();
    }


    //唱歌的同学
    public void playThePiano(){
        studentB.playThePiano();
    }

    //格斗的同学
    public void combat(){
        studentC.combat();
    }
}
