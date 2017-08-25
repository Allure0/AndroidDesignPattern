package com.allure.designPattern.memento;

/**
 * 备忘录保存的状态属性
 * Created by Allure on 2017/8/25.
 */

public class Memento {
    private  int hp;
    private  int mp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
