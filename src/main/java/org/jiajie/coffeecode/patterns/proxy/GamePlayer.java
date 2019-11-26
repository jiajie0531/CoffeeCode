package org.jiajie.coffeecode.patterns.proxy;

/**
 * v2, 强制代理的真实角色
 * v1, 普通代理的游戏者
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    /**
     * 我的代理是谁
     */
    private IGamePlayer proxy = null;

    /**
     * 构造函数限制谁能创建对象，并同时传递姓名
     */
    public GamePlayer( String _name) {
        this.name = _name;
    }

    /**
     * 进游戏之前你肯定要登录吧，这是一个必要条件
     *
     * @param user      用户名
     * @param password  密码
     */
    @Override
    public void login(String user, String password) {
        if (this.isProxy()){
            System.out.println("登录名为"+user+"的用户"+this.name+"登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    /**
     * 打怪，最期待的就是杀老怪
     */
    @Override
    public void killBoss() {
        if (this.isProxy()){
            System.out.println(this.name + "在打怪!");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    /**
     * 升级，升级有很多方法，花钱买是一种，做任务也是一种
     */
    @Override
    public void upgrade() {
        if (this.isProxy()){
            System.out.println(this.name + " 又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    /**
     * 找到自己的代理
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        //this.proxy = new GamePlayerProxy(this.name);
        return this.proxy;
    }

    private boolean isProxy(){
        if (this.proxy == null){
            return false;
        } else {
            return true;
        }
    }
}
