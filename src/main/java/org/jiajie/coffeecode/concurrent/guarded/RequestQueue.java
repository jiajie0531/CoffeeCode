package org.jiajie.coffeecode.concurrent.guarded;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用于依次
 * @author jay
 */
public class RequestQueue {

    private final Queue<Request> queue = new LinkedList<>();

    public synchronized Request getRequest(){
        while (queue.peek() == null){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request){
        queue.offer(request);
        notifyAll();
    }
}
