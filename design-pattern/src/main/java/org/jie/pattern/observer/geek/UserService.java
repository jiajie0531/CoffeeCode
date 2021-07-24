package org.jie.pattern.observer.geek;

/**
 * @author jay
 */
public class UserService {
    public long register(String telephone, String password) {
        System.out.println("register... " + telephone + " " + password);
        return 0L;
    }
}
