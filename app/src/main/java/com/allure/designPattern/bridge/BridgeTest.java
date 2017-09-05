package com.allure.designPattern.bridge;

import com.allure.designPattern.bridge.flavor.Flavor;
import com.allure.designPattern.bridge.flavor.LightFlavor;
import com.allure.designPattern.bridge.flavor.SpicyFlavor;
import com.allure.designPattern.bridge.flavor.SweetFlavor;
import com.allure.designPattern.bridge.person.MiddlePerson;
import com.allure.designPattern.bridge.person.OldPerson;
import com.allure.designPattern.bridge.person.Person;
import com.allure.designPattern.bridge.person.YouthPerson;

/**
 * Created by Allure on 2017/9/5.
 */

public class BridgeTest {

    public static void main(String[] args) {

        //口味
        Flavor sweetFlavor=new SweetFlavor();
        Flavor lightFlavor=new LightFlavor();
        Flavor spicyFlavor=new SpicyFlavor();


        //青年人
        System.out.println("------青年人口味-----");
        Person youthPersonSweet=new YouthPerson(sweetFlavor);
        Person youthPersonLight=new YouthPerson(lightFlavor);
        Person youthPersonSpicy=new YouthPerson(spicyFlavor);
        youthPersonSweet.personTypeAndFlavor();
        youthPersonLight.personTypeAndFlavor();
        youthPersonSpicy.personTypeAndFlavor();
        System.out.println("------青年人口味-----");


        System.out.println("");
        System.out.println("");


        //中年人
        System.out.println("------中年人口味-----");
        Person middlePersonSweet=new MiddlePerson(sweetFlavor);
        Person middlePersonLight=new MiddlePerson(lightFlavor);
        Person middlePersonSpicy=new MiddlePerson(spicyFlavor);
        middlePersonSweet.personTypeAndFlavor();
        middlePersonLight.personTypeAndFlavor();
        middlePersonSpicy.personTypeAndFlavor();
        System.out.println("------中年人口味-----");

        System.out.println("");
        System.out.println("");
        //老年人
        System.out.println("------老年人口味-----");
        Person oldPersonSweet=new OldPerson(sweetFlavor);
        Person oldPersonLight=new OldPerson(lightFlavor);
        Person oldPersonSpicy=new OldPerson(spicyFlavor);
        oldPersonSweet.personTypeAndFlavor();
        oldPersonLight.personTypeAndFlavor();
        oldPersonSpicy.personTypeAndFlavor();
        System.out.println("------老年人口味-----");

        System.out.println("");
        System.out.println("");




    }
}
