package org.jie.pattern.observer.lxf;

/**
 * @author jay
 */
public class Main {
    public static void main(String[] args) {
        // observers
        Admin a = new Admin();
        Customer c = new Customer();
        // store:
        Store store = new Store();
        // 注册观察者
        store.addObserver(a);
        store.addObserver(c);
    }
}
