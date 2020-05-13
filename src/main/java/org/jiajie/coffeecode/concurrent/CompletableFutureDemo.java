package org.jiajie.coffeecode.concurrent;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    static void completedFutureExample() {
        CompletableFuture cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            System.out.println(Thread.currentThread().isDaemon());
            return s.toUpperCase();
        });
        System.out.println(cf.isDone());
        System.out.println(cf.getNow(null));
    }

    public static void main(String[] args) {
        completedFutureExample();
    }
}
