package org.jie.pattern.observer.geek;

/**
 * @author jay
 */
public class RegPromotionObserver implements RegObserver {
    // 依赖注入
    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
