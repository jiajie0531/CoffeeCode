package org.jiajie.coffeecode.jjvms;

public class MethodFind {

    public static void main(String[] args) {
        MerchantOther merchantOther = new VIPOnlyMerchant();
        // 调用实际的方法
        merchantOther.actionPrice(80, new VIP());
        // 调用的是桥接方法，出现 java.lang.ClassCastException 的异常
        merchantOther.actionPrice(90, new NOT_VIP());
    }
}
