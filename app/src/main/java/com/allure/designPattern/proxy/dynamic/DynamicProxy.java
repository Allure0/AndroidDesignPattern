package com.allure.designPattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Allure on 2017/8/31.
 */

public class DynamicProxy implements InvocationHandler {
    private  Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(object,args);
            return result;
    }
}
