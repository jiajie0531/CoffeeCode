package org.jiajie.coffeecode.patterns.observer.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * SMS Listener
 *
 * @author jay
 */
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {


    @Override
    @Async
    public void onApplicationEvent(OrderEvent event) {
        System.out.println(Thread.currentThread() + "...短信监听到..." + event.getMessage() + "......" + event.getSource());
    }
}
