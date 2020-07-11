package org.jiajie.coffeecode.patterns.lazyloading;

public class DelayLoad {
    private DelayLoad(){}

    private static class DelayLoadHolder {
        public static DelayLoad instance = new DelayLoad();
    }

    public static DelayLoad getInstance(){
        return DelayLoadHolder.instance;
    }
}
