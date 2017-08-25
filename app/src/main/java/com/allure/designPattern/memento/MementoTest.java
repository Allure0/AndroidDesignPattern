    package com.allure.designPattern.memento;

/**
 * Created by Allure on 2017/8/25.
 */

public class MementoTest {
    public static void main(String[] args) {

        //战斗开始前的状态
        Player player=new Player();
        player.setHp(100);
        player.setMp(100);
        System.out.print("--------战斗开始前--------");
        player.showPlayerState(player);
        System.out.print("--------战斗开始前--------"+"\n");

        //负责人存储存档
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(player.saveMemento());

        //战斗过程中血量降低到了50,魔法值50
        player.setHp(50);
        player.setMp(50);
        System.out.print("\n"+"--------战斗过程中--------");
        player.showPlayerState(player);
        System.out.print("--------战斗过程中--------"+"\n");

        //战斗死亡恢复战斗之前的状态
        System.out.print("\n"+"--------恢复状态后--------");
        player.restorePlayerState(caretaker.getMemento());
        player.showPlayerState(player);
        System.out.print("--------恢复状态后--------"+"\n");

    }
}
