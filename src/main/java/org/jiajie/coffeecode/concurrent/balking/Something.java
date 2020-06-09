package org.jiajie.coffeecode.concurrent.balking;

/**
 * 只执行一次初始化处理的类
 *
 * @author jay
 */
public class Something {
    private boolean initialized = false;

    public synchronized void init(){
        if (initialized){
            return;
        }
        doInit();
        initialized = true;
    }

    private void doInit() {
        // 实际的初始化处理
    }
}
