package org.jiajie.coffeecode.concurrent.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    /**
     * thenAccept() example
     */
    public void completableFutureThenAcceptDemoMethod(){
//        CompletableFuture.supplyAsync(() -> {
//
//        }
//        );
    }

    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });
        System.out.println(future.thenCompose(i -> CompletableFuture.supplyAsync(() -> { return i+1;})).get());
    }

}
