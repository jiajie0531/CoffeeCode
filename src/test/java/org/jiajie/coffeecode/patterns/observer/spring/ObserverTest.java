package org.jiajie.coffeecode.patterns.observer.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("development")
@SpringBootTest
public class ObserverTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test01() {
        OrderEvent order = new OrderEvent(this, "用户下单成功");
        applicationContext.publishEvent(order);
        System.out.println("... over ...");
    }
}
