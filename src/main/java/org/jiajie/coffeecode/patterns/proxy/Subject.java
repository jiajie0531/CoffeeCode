package org.jiajie.coffeecode.patterns.proxy;

/**
 * 抽象主题类
 */
public interface Subject {

    /**
     * 业务操作
     * @param str   操作信息
     */
    public void doSomething(String str);
}
