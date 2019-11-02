package org.jiajie.coffeecode.patterns.state;

public class Context {
    /**
     * State对象可被共享
     */
    private State state;

    public void request()
    {
        state.handle();
    }

    /**
     * Context将与状态相关的请求委托给当前的ConcreteState对象处理。
     *
     * @param state State
     */
    void changeState( State state )
    {
        this.state = state;
    }
}
