package com.allure.designPattern.memento;

/**
 * 负责人，负责存储的存储人
 * Created by Allure on 2017/8/25.
 */

public class Caretaker {

    private  Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Caretaker() {

    }
}
