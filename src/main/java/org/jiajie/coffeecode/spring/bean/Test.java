package org.jiajie.coffeecode.spring.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jay
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(ac.getBean(Appconfig.class));
    }
}
