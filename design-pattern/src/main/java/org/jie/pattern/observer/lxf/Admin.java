package org.jie.pattern.observer.lxf;

/**
 * 管理员
 *
 * @author jay
 */
public class Admin implements ProductObserver{
    @Override
    public void onPublished(Product product) {
        System.out.println("[Admin] on product published: " + product);
    }

    @Override
    public void onPriceChanged(Product product) {
        System.out.println("[Admin] on product price changed: " + product);
    }
}
