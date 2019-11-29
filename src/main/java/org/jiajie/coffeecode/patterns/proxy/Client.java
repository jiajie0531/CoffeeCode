package org.jiajie.coffeecode.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) throws Exception {

        /** 动态代理的场景类 **/
        // 定义一个主题
        Subject subject = new RealSubject();

//        // 定义一个Handler
//        InvocationHandler handler = new MyInvocationHandler(subject);
//
//        // 定义主题的代理
//        Subject proxy = DynamicProxy.newProxyInstance(
//                subject.getClass().getClassLoader(),
//                subject.getClass().getInterfaces(),
//                handler
//        );

        // 定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);

        // 代理的行为
        proxy.doSomething("Finish");

        /** end of 动态代理的场景类 **/

//        // 定义一个痴迷的玩家
//        IGamePlayer player = new GamePlayer("张三");
//
//        // 定义一个handler
//        InvocationHandler handler = new GamePlayIH(player);
//
//        // 开始打游戏，记下时间戳
//        System.out.println("开始时间是：2009-8-25 10:45");
//
//        // 获得类的class loader
//        ClassLoader cl = player.getClass().getClassLoader();
//
//        // 动态产生一个代理者
//        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
//
//        // 登录
//        proxy.login("zhangSan", "password");
//        // 开始杀怪
//        proxy.killBoss();
//        // 升级
//        proxy.upgrade();
//        // 记录结束游戏时间
//        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
