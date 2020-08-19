package org.jiajie.coffeecode.patterns.observer.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * SMS Listener
 *
 * @author jay
 */
@Component
public class SmsListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return eventType == OrderEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return true;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(Thread.currentThread() + "...短信smart监听到..." +
                ((OrderEvent) event).getMessage() + "......" +
                event.getSource());
    }
}
