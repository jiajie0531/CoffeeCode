package org.jiajie.coffeecode.concurrent.balking;

import java.io.IOException;

/**
 * 定期保存数据内容的类
 */
public class SaveThread extends Thread {
    private final Data data;

    public SaveThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                data.save();
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
