package org.jiajie.coffeecode.patterns.proxy;

public class Client {

    public static void main(String[] args) throws Exception {

        /** 动态代理的场景类 **/
        // 定义一个主题
        Subject subject = new RealSubject();

        // 定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);

        // 代理的行为
        proxy.doSomething("Finish");

        /** end of 动态代理的场景类 **/
    }
}
