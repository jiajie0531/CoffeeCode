package org.jiajie.coffeecode.concurrent.active;

import org.jiajie.coffeecode.concurrent.activeobject.ActiveObject;

/**
 * 发出"显示字符串"请求的线程
 *
 * @author jay
 */
public class DisplayClientThread extends Thread {
    private final ActiveObject activeObject;

    public DisplayClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                // 没有返回值的调用
                String string = Thread.currentThread().getName() + " " + i;
                activeObject.displayString(string);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
