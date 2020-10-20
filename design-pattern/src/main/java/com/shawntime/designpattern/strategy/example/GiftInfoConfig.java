package com.shawntime.designpattern.strategy.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 礼品信息配置类
 *
 * @author jay
 */
@Configuration
public class GiftInfoConfig {

    @Resource
    private IGiftInfoStrategyService doubleElevenGiftInfoStrategyService;

    @Resource
    private IGiftInfoStrategyService summerBuyDayGiftInfoStrategyService;

    /**
     * 注入 bean
     *
     * @return bean
     */
    @Bean
    public Map<Integer, IGiftInfoStrategyService> giftInfoStrategyServiceMap(){
        Map<Integer, IGiftInfoStrategyService> dataMap = new HashMap<>();
        dataMap.put(1, summerBuyDayGiftInfoStrategyService);
        dataMap.put(2, doubleElevenGiftInfoStrategyService);
        return dataMap;
    }
}
