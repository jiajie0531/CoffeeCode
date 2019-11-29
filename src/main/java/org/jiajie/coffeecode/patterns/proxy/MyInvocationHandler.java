package org.jiajie.coffeecode.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * class_name: MyInvocationHandler
 * package: org.jiajie.coffeecode.patterns.proxy
 * describe: 动态代理的Handler类
 * creat_user: jay.jia
 * creat_date: 2019/11/29
 * creat_time: 14:20
 **/
public class MyInvocationHandler implements InvocationHandler {

    /** 被代理的对象 **/
    private Object target = null;

    /** 通过构造函数传递一个对象 **/
    public MyInvocationHandler(Object _obj) {
        this.target = _obj;
    }

    /** 代理方法 **/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /** 执行被代理的方法 **/
        return method.invoke(this.target, args);
    }

}
