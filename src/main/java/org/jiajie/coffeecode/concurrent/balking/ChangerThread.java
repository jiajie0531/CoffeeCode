package org.jiajie.coffeecode.concurrent.balking;

import java.io.IOException;
import java.util.Random;

/**
 * 用于修改数据内容，并执行保存处理
 *
 * @author jay
 */
public class ChangerThread extends Thread {
    private final Data data;
    private final Random random = new Random();

    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; true; i++) {
                /* 修改数据 */
                data.changed("No." + i);
                /* 执行其他操作 */
                Thread.sleep(random.nextInt(1000));
                /* 显示地保存 */
                data.save();
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
