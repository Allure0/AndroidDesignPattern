package com.allure.designPattern.proxy;

/**
 * 优点： 业务类只需要关注业务逻辑本身，保证了业务类的重用性。这是代理的共有优点。
 缺点：

 代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。
 如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。
 * Created by Allure on 2017/8/31.
 */

public class UserBuyCar implements Car {

    private String name;


    @Override
    public void buyCar() {
        System.out.print("\n"+"用户买了"+getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
