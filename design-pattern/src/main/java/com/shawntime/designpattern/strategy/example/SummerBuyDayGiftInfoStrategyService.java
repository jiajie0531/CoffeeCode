package com.shawntime.designpattern.strategy.example;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jay
 */
@Service
public class SummerBuyDayGiftInfoStrategyService implements IGiftInfoStrategyService {
    @Resource
    private GiftInfoMapper giftInfoMapper;

    @Override
    public GiftInfo getGiftInfo(int activityId) {
        // 从数据库中查询
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(1);
        giftInfo.setGiftName("铁锅三件套");
        giftInfoMapper.getGiftInfoByActivityId(activityId);
        return giftInfo;
    }
}
