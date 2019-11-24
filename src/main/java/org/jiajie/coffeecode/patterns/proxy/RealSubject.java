package org.jiajie.coffeecode.patterns.proxy;

/**
 * 真实主题类
 * RealSubject是一个正常的业务实现类，代理模式的核心就在代理类上。
 */
public class RealSubject implements Subject {

    /**
     *  实现方法
     */
    @Override
    public void request() {
        // 业务逻辑处理
    }
}
