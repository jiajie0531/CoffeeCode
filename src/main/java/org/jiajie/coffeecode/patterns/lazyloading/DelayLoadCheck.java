package org.jiajie.coffeecode.patterns.lazyloading;

public class DelayLoadCheck {
    private DelayLoadCheck() {
    }

    private static DelayLoadCheck instance;

    public static DelayLoadCheck getInstance() {
        if (instance == null) {                  // 第一次检查
            synchronized (DelayLoad.class) {
                if (instance == null) {         // 第二次检查
                    instance = new DelayLoadCheck();    // 创建实例
                }
            }
        }
        return instance;
    }
}
