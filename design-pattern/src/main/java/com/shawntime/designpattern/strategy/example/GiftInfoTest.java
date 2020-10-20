package com.shawntime.designpattern.strategy.example;

import javax.annotation.Resource;

/**
 * @author jay
 */
public class GiftInfoTest {

    @Resource
    private GiftInfoContext giftInfoContext;

    public GiftInfo getGiftInfo(int subjectId, int activityId){
        GiftInfo giftInfo = giftInfoContext.getGiftInfo(subjectId, activityId);
        return giftInfo;
    }
}
