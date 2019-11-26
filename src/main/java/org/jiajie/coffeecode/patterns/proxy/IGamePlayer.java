package org.jiajie.coffeecode.patterns.proxy;

public interface IGamePlayer {

    /**
     * 登录游戏
     * @param user
     * @param password
     */
    public void login(String user, String password);

    /**
     * 杀怪，网络游戏的主要特色
     */
    public void killBoss();

    /**
     * 升级
     */
    public void upgrade();

    /**
     * 每个人都可以找一下自己的代理
     * 增加了一个getProxy方法，指定要访问自己必须通过哪个代理
     */
    public IGamePlayer getProxy();

}
