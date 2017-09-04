package com.allure.designPattern.composite;

import com.allure.designPattern.composite.safe.SafeComposite;
import com.allure.designPattern.composite.safe.SafeLeaf;
import com.allure.designPattern.composite.transparent.TransparentComponent;
import com.allure.designPattern.composite.transparent.TransparentComposite;
import com.allure.designPattern.composite.transparent.TransparentLeaf;

/**
 * Created by Allure on 2017/9/1.
 */

public class CompositeTest {

    public static void main(String[] args) {

        //安全组合
        SafeComposite safeComponent=new SafeComposite("全国城市");

        SafeComposite beijing=new SafeComposite("北京市");
        SafeLeaf beijingshi=new SafeLeaf("北京市");
        beijing.addChild(beijingshi);
        safeComponent.addChild(beijing);

        SafeComposite sichuan=new SafeComposite("四川省");
        SafeLeaf chengdushi=new SafeLeaf("成都市");
        SafeLeaf mianyangshi=new SafeLeaf("绵阳市");

        sichuan.addChild(chengdushi);
        sichuan.addChild(mianyangshi);
        safeComponent.addChild(sichuan);


        SafeComposite guangdong=new SafeComposite("广东省");
        SafeLeaf guangdongshi=new SafeLeaf("广东市");
        guangdong.addChild(guangdongshi);
        safeComponent.addChild(guangdong);
        safeComponent.println(" ");





        //透明组合
        TransparentComponent component=new TransparentComposite("全国城市");


        TransparentComponent component1=new TransparentComposite("北京市");
        TransparentComponent component4=new TransparentLeaf("北京");
        component1.addChild(component4);


        TransparentComponent component2=new TransparentComposite("四川省");
        TransparentComponent component5=new TransparentLeaf("成都市");
        TransparentComponent component7=new TransparentLeaf("绵阳市");
        component2.addChild(component5);
        component2.addChild(component7);

        TransparentComponent component3=new TransparentComposite("广东省");
        TransparentComponent component6=new TransparentLeaf("广州市");
        component3.addChild(component6);


        component.addChild(component1);
        component.addChild(component2);
        component.addChild(component3);

        component.println(" ");






    }
}
