package org.jie.pattern.observer.geek;

/**
 * @author jay
 */
public class NotificationService {

    public void sendInboxMessage(long userId, String msg){
        System.out.println(" " + userId + " " + msg);
    }
}
