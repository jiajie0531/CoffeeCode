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

}
