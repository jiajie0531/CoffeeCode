package org.jiajie.coffeecode.jjvms;

abstract class MerchantOther<T extends Customer> {
    public double actionPrice(double price, T customer) {
        return price * 0.08;
    }
}