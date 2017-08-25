package com.allure.designPattern.memento;

/**
 * Created by Allure on 2017/8/25.
 */

public class Player {
    private int hp;
    private int mp;

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

    public Player() {
    }

    //玩家状态
    public void showPlayerState(Player player){
        System.out.println("\n"+"当前hp:" +getHp() +"\n"+ "当前mp:" + getMp());
    }

    //保存玩家的HP,MP
    public  Memento saveMemento(){
        Memento memento=new Memento();
        memento.setHp(getHp());
        memento.setMp(getMp());
        return memento;
    }

    //恢复玩家的HP,MP
    public void restorePlayerState(Memento memento){
        this.hp=memento.getHp();
        this.mp=memento.getMp();
    }
}
