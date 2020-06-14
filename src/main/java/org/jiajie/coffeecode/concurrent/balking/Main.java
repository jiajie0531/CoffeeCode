package org.jiajie.coffeecode.concurrent.balking;

import java.util.concurrent.TimeoutException;

/**
 * 测试程序行为的类
 *
 * @author jay
 */
public class Main {

    public static void main(String[] args) {
//        Data data = new Data("data.txt", "(empty)");
//        new ChangerThread("ChangerThread", data).start();
//        new SaverThread("SaverThread", data).start();

        Host host = new Host(10000);
        try {
            System.out.println("execute BEGIN");
            host.execute();
        } catch (TimeoutException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
