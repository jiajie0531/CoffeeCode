package org.jie.pattern.observer.lxf;

/**
 * 消费者
 *
 * @author jay
 */
public class Customer implements ProductObserver{
    @Override
    public void onPublished(Product product) {
        System.out.println("[Customer] on product published: " + product);
    }

    @Override
    public void onPriceChanged(Product product) {
        System.out.println("[Customer] on product price changed: " + product);
    }
}
