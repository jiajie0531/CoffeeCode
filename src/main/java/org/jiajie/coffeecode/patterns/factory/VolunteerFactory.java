package org.jiajie.coffeecode.patterns.factory;

/**
 * 学雷锋的大学生工厂
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
