package org.jiajie.coffeecode.patterns.proxy;

/**
 * 真实主题类
 * RealSubject是一个正常的业务实现类，代理模式的核心就在代理类上。
 */
public class RealSubject implements Subject {

    /**
     * 业务操作
     *
     * @param str   操作信息
     */
    @Override
    public void doSomething(String str) {
        System.out.println("do something!--->" + str);
    }
}
