package org.jiajie.coffeecode.patterns.observer.spring.smart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("development")
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testPublishEvent(){
        System.out.println("发布配置更新：");
        ConfigRefreshEvent event = new ConfigRefreshEvent("配置更新了");
        applicationContext.publishEvent(event);
    }
}
