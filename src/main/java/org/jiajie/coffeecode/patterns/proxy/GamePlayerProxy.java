package org.jiajie.coffeecode.patterns.proxy;

/**
 * 普通代理的代理者
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    /**
     * 通过构造函数传递要对谁进行代练
     */
    public GamePlayerProxy(String name) {
        try{
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e){
            // TODO 异常处理
        }
    }

    /**
     * 代练登录
     *
     * @param user          用户名
     * @param password      密码
     */
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    /**
     * 代练杀怪
     */
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代练升级
     */
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
