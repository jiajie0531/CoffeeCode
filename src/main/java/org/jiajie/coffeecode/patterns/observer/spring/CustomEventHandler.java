package org.jiajie.coffeecode.patterns.observer.spring;

import org.springframework.context.ApplicationListener;

/**
 * @author jay
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
