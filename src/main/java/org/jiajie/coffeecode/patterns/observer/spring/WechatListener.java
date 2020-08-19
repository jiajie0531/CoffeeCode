package org.jiajie.coffeecode.patterns.observer.spring;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author jay
 */
@Component
public class WechatListener {
    @EventListener
    @Order(2)
    public void receiveOrderEvent(OrderEvent event) {
        System.out.println(Thread.currentThread() + "...微信2监听到..." +
                event.getMessage() + "......" +
                event.getSource());
    }

    @EventListener(classes = {OrderEvent.class})
    @Order(1)
    public void receiveOrderEvent(Object event) {
        System.out.println(Thread.currentThread() + "...微信1监听到..." +
                ((OrderEvent) event).getMessage() + "......" +
                ((OrderEvent) event).getSource());
    }
}
