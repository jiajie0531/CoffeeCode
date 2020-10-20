package com.shawntime.designpattern.strategy.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 礼品信息环境角色类
 *
 * @author jay
 */
@Component
public class GiftInfoContext {

    /**
     * 注入的策略
     */
    @Autowired
    private Map<Integer, IGiftInfoStrategyService> giftInfoStrategyServiceMap;

    /**
     * 对外暴露的统一获取礼品信息的返回
     *
     * @param subjectId     subjectId
     * @param activityId    activityId
     * @return  礼品信息
     */
    public GiftInfo getGiftInfo(int subjectId, int activityId){
        IGiftInfoStrategyService giftInfoStrategyService = giftInfoStrategyServiceMap.get(subjectId);
        // Assert.assertNotNull(giftInfoStrategyService);
        return giftInfoStrategyService.getGiftInfo(activityId);
    }
}
