package org.jie.pattern.observer.lxf;

/**
 * @author jay
 */
public interface ProductObserver {

    void onPublished(Product product);

    void onPriceChanged(Product product);
}
