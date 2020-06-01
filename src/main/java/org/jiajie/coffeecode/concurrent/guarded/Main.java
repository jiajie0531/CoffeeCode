package org.jiajie.coffeecode.concurrent.guarded;

/**
 * @author jay
 */
public class Main {

    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 31415592L).start();
        new ServerThread(requestQueue, "Bobby", 61415592L).start();
    }
}
